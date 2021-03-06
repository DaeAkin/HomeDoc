package com.www.homedoc.service.interceptor;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.www.homedoc.dto.AlertDto;
import com.www.homedoc.service.MemberService;

@Component
public class AlertInterceptor implements HandlerInterceptor {
	
	@Inject
	MemberService memberService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Interceptor preHandle()");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HttpSession session = request.getSession();
		

		
		String id = (String)session.getAttribute("id");
		
		if(id != null) {
			
			System.out.println("alert 가져올 id : " + id);
			
			System.out.println("memberService 가 널 ? : " + memberService);
			System.out.println("AlertInterceptor 알람 가져오기 실행!!");
			List<AlertDto> alertDtos = 
					memberService.getAlert(id);
		
			System.out.println("alertDtos.toString() :" + alertDtos.toString());
			System.out.println("alertDtos : " + alertDtos);
//			modelAndView.addObject("alertDtos", alertDtos);
			
			request.setAttribute("alertDtos", alertDtos);
			request.setAttribute("alertSize",alertDtos.size());

		
			
			
		}
	
		System.out.println("---하이하이 !!!! 인터셉터!! =---");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
