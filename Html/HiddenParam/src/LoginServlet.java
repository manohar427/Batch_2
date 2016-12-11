

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("I am from doGet()");
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String secureId = request.getParameter("secureId");
		
		System.out.println("UserName :"+userName);
		System.out.println("password :"+password);
		
		ServletOutputStream out = response.getOutputStream();
		out.println("User Name:"+userName);
		out.println("<Br>Password:"+password);
		out.println("<Br>secureId:"+secureId);
		
		//tax Calculation
		int totalTax =7897;
		
		RequestDispatcher rd = request.getRequestDispatcher("TaxCalculation");
		request.setAttribute("Tax", totalTax);
		
		
		
		HttpSession sesion =   request.getSession();
		
		String userid = (String)sesion.getAttribute("USERID");
		
		if(userid == null){
			//Connect to DB
			out.println("<Br>Connecting to DB and getting USER ID");
			sesion.setAttribute("USERID", "878787");
		}else{
			out.println("<Br>User id already available in SESSION");
		}
		
		
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
