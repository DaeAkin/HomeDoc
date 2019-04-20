package com.www.homedoc.service;

import java.util.Random;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.util.RandomNumberMaker;

@Component
public class MemberMailSender implements MailService{
	

	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	RandomNumberMaker randomNumber;
	

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void setRandomNumber(RandomNumberMaker randomNumber) {
		this.randomNumber = randomNumber;
	}
	

	private int random;
	
	@Override
	public int authenticationsend(String email) {
		random =  randomNumber.numberMaker();
		
		
		MimeMessagePreparator mimeMessagePreparator = new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage paramMimeMessage) throws Exception {
				MimeMessageHelper message = new MimeMessageHelper(paramMimeMessage,true,"UTF-8");
				
				message.setTo(email);
				message.setFrom("Homedoc");
				message.setSubject("HomeDoc 회원가입 인증 메일입니다.");
//				message.setText("<!doctype html>");
//				message.setText("<html lang=\"ko\">");
//				message.setText("<head>");
//				message.setText(" <title>이메일 인증</title>");
//				message.setText(" <meta charset=\"utf-8\">");
//				message.setText("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
//				message.setText("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css' integrity='sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M' crossorigin='anonymous'>");
//				message.setText("</head>");
//				message.setText("<body>");
//				message.setText("<div class=\'jumbotron jumbotron-fluid\'>");
//				message.setText(" <div align=\"center\" class=\"container\">");
//				message.setText(" <h1 class=\"display-3\">이메일 인증</h1><br>");
//				message.setText(" <p class=\"lead\">안녕하세요. <font size=\"5\" color=\"red\"><b>HomeDoc</b></font> 입니다.");
//				message.setText(" <br>");
//				message.setText(" 인증번호는 다음과 같습니다.<br><font size=\"7\"> [ " + random + " ] </font>");
//				message.setText("</p>");
//				message.setText(" <p class=\"lead\">");
//				message.setText(" <a class=\"btn btn-success btn-lg\" href=\"http://kei890.iptime.org/comso\" role=\"button\">HomeDoc 바로가기</a>");
//				message.setText(" </p>");
//				message.setText(" </div>");
//				message.setText(" </div>");
//				message.setText("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>");
//				message.setText("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>");
//				message.setText("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>");
//				message.setText("</body>");
//				message.setText("</html>");
				
				String content = "<!doctype html> "
						+ "<html lang='ko'> "
						+ " <head>"
						+ "<title>이메일 인증</title>"
						+ "<meta charset=\"utf-8\">\n" + 
						"				    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">"
						+ "\n" + 
						"				    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n" + 
						"				  </head>\n" + 
						"				  <body>\n" + 
						"				    <div class=\"jumbotron jumbotron-fluid\">\n" + 
						"				  <div align=\"center\" class=\"container\">\n" + 
						"				    <h1 class=\"display-3\">이메일 인증</h1><br>\n" + 
						"				    <p class=\"lead\">안녕하세요. <font size=\"5\" color=\"red\"><b>HomeDoc</b></font> 입니다.\n" + 
						"				        <br>\n" + 
						"				        인증번호는 다음과 같습니다.<br><font size=\"7\"> [ "+random+" ] </font>\n" + 
						"				      </p>\n" + 
						"				         <p class=\"lead\">\n" + 
						"				    <a class=\"btn btn-success btn-lg\" href=\"http://kei890.iptime.org/comso\" role=\"button\">HomeDoc 바로가기</a>\n" + 
						"				  </p>\n" + 
						"				  </div>\n" + 
						"				</div>\n" + 
						"\n" + 
						"				    <!-- Optional JavaScript -->\n" + 
						"				    <!-- 먼저 jQuery가 오고 그 다음 Popper.js 그 다음 Bootstrap JS -->\n" + 
						"				    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n" + 
						"				    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\" integrity=\"sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh\" crossorigin=\"anonymous\"></script>\n" + 
						"				    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n" + 
						"				  </body>\n" + 
						"				</html>";
				
				 
				    message.setText(content, true);
				    

				 
				
				
				
				
				
			}
		};

		
		
		try {
			mailSender.send(mimeMessagePreparator);
			return random;
		} catch (MailException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
		
		
	}

	@Override
	public void congratutationEmailSend(MemberDto member) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setSubject("HomeDoc 회원가입을 진심으로 축하합니다.");
		message.setText("BlaBlablaaa");
		message.setFrom("HomeDoc");
		message.setTo(member.getEmail());
		
		
		try {
			mailSender.send(message);
			
		} catch (MailException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	public boolean validationEmail(int validationNumber) {
		// validationNumber : 들어온 인증번호 값 
		// random : 랜덤으로 생성한 인증번호 값
		if(random == validationNumber) {
			System.out.println(validationNumber + "메일 인증 성공");
			return true;
		}
		
		return false;
		
	}
	




}
