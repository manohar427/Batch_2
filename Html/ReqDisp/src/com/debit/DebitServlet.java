package com.debit;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DebitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DebitServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am from DebitServlet Servlet doGet");
		response.getOutputStream().println("I am from DebitServlet Servlet doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am from DebitServlet Servlet doPost");
	}

}
