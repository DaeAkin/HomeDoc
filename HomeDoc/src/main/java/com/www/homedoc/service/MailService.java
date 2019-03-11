package com.www.homedoc.service;

import javax.mail.Message;

import com.www.homedoc.dto.MemberDto;

public interface MailService {

	int authenticationsend(String email);
	
	void congratutationEmailSend(MemberDto member);
	
	
}
