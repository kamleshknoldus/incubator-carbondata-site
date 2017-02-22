import com.sendgrid.*;
import java.io.IOException;
import java.util.logging.*;

public class Mailer {

	private Constants constants = new Constants();
	private MailTemplate template = new MailTemplate();
	private Logger LOGGER = Logger.getLogger(Mailer.class.getName());

	public void sendAcknowlegment(String username, String to) throws IOException {

		Email from = new Email(constants.CARBON_MAIL);
		Email sender = new Email(to);
		Content content = new Content("text/html", template.getAcknowlegment(username));
		Mail mail = new Mail(from, constants.SUBJECT_ACKNOWLEGMENT, sender, content);
		SendGrid sg = new SendGrid(constants.SENDGRID_API_KEY);

		Request request = new Request();
		try {
			request.method = Method.POST;
			request.endpoint = "mail/send";
			request.body = mail.build();
			Response response = sg.api(request);
			LOGGER.info("Acknowlegment Mail Sent to :" + to + " with status: [" + response.statusCode + "],body : ["
					+ response.body + "] and headers : [" + response.headers + "].");
			System.out.println("Acknowlegment Mail Sent to :" + to + " with status: [" + response.statusCode
					+ "],body : [" + response.body + "] and headers : [" + response.headers + "].");
		} catch (IOException ex) {
			LOGGER.info("Failed to send Acknowlegment Mail to :" + to + " with the following error :" + ex);
			throw ex;
		}
	}

	public void forwardFeedback(String username, String from, String feedback) throws IOException {

		Email to = new Email(constants.FEEDBACK_MAIL);
		Email sender = new Email(from);
		Content content = new Content("text/html", template.getFeedback(username, from, feedback));
		Mail mail = new Mail(to, constants.SUBJECT_FEEDBACK + " " + from, sender, content);
		SendGrid sg = new SendGrid(constants.SENDGRID_API_KEY);

		Request request = new Request();
		try {
			request.method = Method.POST;
			request.endpoint = "mail/send";
			request.body = mail.build();
			Response response = sg.api(request);
			LOGGER.info("Feedback Mail Sent to :" + to + " with status: [" + response.statusCode + "],body : ["
					+ response.body + "] and headers : [" + response.headers + "]");
			System.out.println("Feedback Mail Sent to :" + to + " with status: [" + response.statusCode + "],body : ["
					+ response.body + "] and headers : [" + response.headers + "].");
		} catch (IOException ex) {
			LOGGER.info("Failed to send Feedback Mail to :" + to + " with the following error :" + ex);
			throw ex;
		}
	}

}
