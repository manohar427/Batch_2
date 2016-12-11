package com.login;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.emp.Employee;

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
		
		
		Configuration cfg = new Configuration();
		cfg.configure("com/test/cfg/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session1 = factory.openSession();

		Transaction t = session1.beginTransaction();
		getEmployeeList(session1);

		t.commit();
		session1.close();

		System.out.println("successfully saved");
		
	}

	private  void getEmployeeList(Session session) {
		List employees = session.createQuery("FROM Employee").list();
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.print("First Name: " + employee.getFirstName());
			System.out.print("  Last Name: " + employee.getLastName());
			System.out.println("  ID: " + employee.getId());
		}
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
