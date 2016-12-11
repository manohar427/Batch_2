

import java.io.IOException;

import javax.print.attribute.standard.Severity;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sevlet 1 doaget");
		ServletConfig scon =  getServletConfig();
		String discount = scon.getInitParameter("discount");
		System.out.println("Servlet1 Discount is :"+discount);
		
		ServletContext context = getServletContext();
		String retailDiscount = context.getInitParameter("RetailDisc");
		System.out.println("Servlet1 retailDiscount is :"+retailDiscount);
		
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.include(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
