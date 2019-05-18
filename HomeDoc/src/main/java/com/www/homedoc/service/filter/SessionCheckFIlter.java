package com.www.homedoc.service.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.www.homedoc.service.MemberService;

public class SessionCheckFIlter implements Filter {
s

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)servletRequest;
		
		HttpSession session = request.getSession();

		String id = (String) session.getAttribute("id");

		if (id == null) {
			System.out.println("세선이 만료되었습니다. 다시 로그인해주세요.");
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
