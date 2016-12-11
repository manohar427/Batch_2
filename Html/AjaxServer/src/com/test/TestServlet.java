package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String countryName = request.getParameter("country");
		System.out.println("countryName" + countryName);
		response.getOutputStream();
		//response.getOutputStream().println("<B>State</b>:");
		if (countryName.equalsIgnoreCase("india")) {
			response.getOutputStream().println("<select>");
			response.getOutputStream().println("<option>AP</option>");
			response.getOutputStream().println("<option>KA</option>");
			response.getOutputStream().println("<option>TN</option>");
			response.getOutputStream().println("</select>");
		} else if (countryName.equalsIgnoreCase("us")) {
			response.getOutputStream().println("<select>");
			response.getOutputStream().println("<option>US1</option>");
			response.getOutputStream().println("<option>US2</option>");
			response.getOutputStream().println("<option>US3</option>");
			response.getOutputStream().println("</select>");
		} else if (countryName.equalsIgnoreCase("uk")) {
			response.getOutputStream().println("<select>");
			response.getOutputStream().println("<option>UK1</option>");
			response.getOutputStream().println("<option>UK2</option>");
			response.getOutputStream().println("<option>UK3</option>");
			response.getOutputStream().println("</select>");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
