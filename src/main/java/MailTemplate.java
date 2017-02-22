import java.io.IOException;

public class MailTemplate {

	private String feedback = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>"
			+ "<html xmlns='http://www.w3.org/1999/xhtml'>" + "<head>"
			+ "<meta http-equiv='Content-Type' content='text/html; charset=iso-8859-1' />"
			+ "<title>Community email</title>" + "</head>" + "" + "<body style='font-family:arial'>"
			+ "    <table width='100%%' cellpadding='0' cellspacing='0' border='0'>" + "        <tr>"
			+ "            <td align='' valign='top'>"
			+ "                <table  width='86%%' cellpadding='0' cellspacing='0'  border='0' style='border:4px solid #ff943d; margin:0 auto; background:#fcfcfc'>"
			+ "                    <tr>"
			+ "                        <td align='center' valign='top' style='border-bottom:1px solid #eee'>"
			+ "                        <table  width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "                            <tr>"
			+ "                                <td align='left' valign='middle' style='padding:15px'>"
			+ "                                <img class='logo' height='30px' src='http://carbondata.apache.org/images/CarbonDataLogo.png' alt='' />"
			+ "                            </tr>" + "                        </table>" + "                        </td>"
			+ "                    </tr>" + "                    <tr>"
			+ "                        <td align='center' valign='top' >"
			+ "                        <table width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "                            <tr>"
			+ "                                <td align='left' valign='middle' style=' color:#222; font-size: 16px;padding:30px 15px 10px'>Hi CarbonData Community,"
			+ "                                 </td>" + "                            </tr>"
			+ "                            <tr>"
			+ "                                <td align='left' style='font-size: 13px; color:#222;  padding:10px 15px 30px;'>"
			+ "                                %s [%s] has send the following message : "
			+ "                                %s     " + "" + "                                </td>"
			+ "                            </tr>                            " + "                          </table>"
			+ "                        </td>" + "                    </tr>" + "                    "
			+ "                    " + "                    <tr>"
			+ "                        <td align='center' valign='top' style='height:20px' ></td>"
			+ "                    </tr>" + "                    " + "                </table>" + "            </td>"
			+ "        </tr>    " + "    </table> " + "</body>" + "</html>";

	private String acknowlegment = "<!DOCTYPE html>" + "<html>" + "<head>" + "<title>User acknowledgement</title>" + "</head>"
			+ "" + "<body style='font-family:arial'>" + "    <table width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "        <tr>" + "            <td align='' valign='top'>"
			+ "                <table width='86%%' cellpadding='0' cellspacing='0'  border='0' style='border:4px solid #ff943d; margin:0 auto; background:#fcfcfc'>"
			+ "                    <tr>"
			+ "                        <td align='center' valign='top' style='border-bottom:1px solid #eee'>"
			+ "                        <table width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "                            <tr>"
			+ "                                <td align='left' valign='middle' style='padding:15px'>"
			+ "                                <img class='logo' height='30px' src='http://carbondata.apache.org/images/CarbonDataLogo.png' alt='' />"
			+ "                            </tr>" + "                        </table>" + "                        </td>"
			+ "                    </tr>" + "                    <tr>"
			+ "                        <td align='center' valign='top'>"
			+ "                        <table width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "                            <tr>"
			+ "                                <td align='left' valign='middle' style=' color:#222; font-size: 16px;padding:30px 15px 10px'>Dear %s,  </td>"
			+ "                            </tr>" + "                            <tr>"
			+ "                                <td align='left' style='font-size: 13px; color:#222;  padding:10px 15px 80px;' >"
			+ "                                Thank you for taking the time to write the feedback. We have directed your feedback to"
			+ " the CarbonData Community. Again, thank you for the valuable feedback, it will help us " + "grow better."
			+ "                                </td>" + "                            </tr>"
			+ "                             <tr>" + "                                <td align='left' valign='middle >"
			+ "                                 <table width='100%%' cellpadding='0' cellspacing='0' border='0'>"
			+ "                                    <tr>"
			+ "                                       <td align='left' valign='middle' style=' color:#222; font-size: 15px;padding:0px 15px'>Greetings ! </td>"
			+ "                                    </tr>" + "                                    <tr>"
			+ "                                       <td align='left' valign='middle' style=' color:#222; font-size:13px;padding:4px 15px'>CarbonData Community  </td>"
			+ "                                    </tr>" + "                                  </table>" + "" + ""
			+ "                                  </td>" + "                            </tr>"
			+ "                          </table>" + "                        </td>" + "                    </tr>" + ""
			+ "" + "                    <tr>" + "                        <td  ></td>" + "                    </tr>" + ""
			+ "                </table>" + "            </td>" + "        </tr>" + "    </table>" + "</body>"
			+ "</html>";

	public String getFeedback(String userName, String userMail, String userFeedback) {
		return String.format(feedback, userName, userMail, userFeedback);
	}

	public String getAcknowlegment(String userName) {
		return String.format(acknowlegment, userName);
	}

}
