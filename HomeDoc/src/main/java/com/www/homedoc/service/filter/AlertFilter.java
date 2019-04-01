package com.www.homedoc.service.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.service.MemberService;
@Deprecated
public class AlertFilter implements Filter{
	
	@Autowired
	MemberService memberService;
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("---- doFilter ----C");
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
