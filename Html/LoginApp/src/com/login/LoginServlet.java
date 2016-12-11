package com.login;

import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		System.out.println("I am from LoginServlet()");
	}

	/*protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("I am from service()");
	}*/

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("I am from doGet()");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("UserName :"+userName);
		System.out.println("password :"+password);
		
		ServletOutputStream op = response.getOutputStream();
		//DB
		if(userName.equals("xyz") && password.equals("pqr")){
			op.println("Xyz Loggedin Successfully !");
		}else{
			op.println("Please provice valid credentials");
		}
		HttpSession session = request.getSession();
		System.out.println("Session :"+session.getId());
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		System.out.println("My Session Id:"+session.getId());
		session.setMaxInactiveInterval(1);
		
		System.out.println("I am from doPost()");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("UserName :"+userName);
		System.out.println("password :"+password);
		
		ServletOutputStream op = response.getOutputStream();
		//DB
		if(userName.equals("xyz") && password.equals("pqr")){
			op.println("Xyz Loggedin Successfully !");
		}else{
			op.println("Please provice valid credentials");
		}
		
	}

}
