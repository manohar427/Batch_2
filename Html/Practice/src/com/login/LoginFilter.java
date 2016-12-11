package com.login;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public LoginFilter() {
		System.out.println(" fileter LoginFilter()");
	}

	public void destroy() {
		System.out.println(" fileter destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("i am from do filter start");
		HttpServletRequest req = (HttpServletRequest) request;

		HttpSession session = req.getSession(false);
		HttpServletResponse res = (HttpServletResponse) response;
		if (session == null) {
			System.err.println("Session time out happend.");
			res.sendRedirect("logout.html");
		}else{
			chain.doFilter(request, response);
		}
		//chain.doFilter(request, response);
		System.out.println("i am from do filter end");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(" fileter init");
	}

}
