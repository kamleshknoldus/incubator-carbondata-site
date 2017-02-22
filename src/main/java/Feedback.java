import javax.servlet.http.*;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.*;
import java.io.IOException;

public class Feedback extends HttpServlet {

	/**
	 * This method handles the feedback request.
	 */

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		Mailer mailer = new Mailer();

		String username = request.getParameter("name");
		String usermail = request.getParameter("email");
		String feedback = request.getParameter("message");

		try {
			mailer.sendAcknowlegment(username, usermail);
			mailer.forwardFeedback(username, usermail, feedback);
			RequestDispatcher view = request.getRequestDispatcher("/thanks.html");
			view.forward(request, response);
		} catch (IOException ex) {
			RequestDispatcher view = request.getRequestDispatcher("/failure.html");
			view.forward(request, response);
		}
	}
}