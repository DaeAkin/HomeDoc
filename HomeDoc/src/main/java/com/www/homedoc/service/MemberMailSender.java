package com.www.homedoc.service;

import java.util.Random;

import javax.annotation.Resource;
import javax.mail.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.www.homedoc.dto.MemberDto;
import com.www.homedoc.util.RandomNumberMaker;

public class MemberMailSender implements MailService{
	
	
	
	@Autowired
	MailSender mailSender;
	
	@Autowired
	RandomNumberMaker randomNumber;
	

	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void setRandomNumber(RandomNumberMaker randomNumber) {
		this.randomNumber = randomNumber;
	}
	

	int random;
	
	@Override
	public int authenticationsend(String email) {
		random =  randomNumber.numberMaker();
		
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("HomeDoc 회원가입 인증 메일입니다.");
		message.setText("회원가입인증메일은 :" + random + "입니다.");
		message.setFrom("HomeDoc");
		message.setTo(email);
		
		
		try {
			mailSender.send(message);
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
