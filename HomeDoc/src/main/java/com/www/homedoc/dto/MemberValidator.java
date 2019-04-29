package com.www.homedoc.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
//		System.out.println("supports ? :" + MemberDto.class.isAssignableFrom(clazz));
//		
//		System.out.println("validator 통과 : " + clazz.getName().toString());
		return MemberDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "", "아이디를 입력해주세요.");
//		MemberDto memberDto = (MemberDto) object;
		System.out.println("-- MemberValidator validate() --");
//		System.out.println(		errors.getErrorCount());

	}

}
