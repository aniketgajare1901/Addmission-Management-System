package Admission.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admission.Dao.AdmissionDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		String username=request.getParameter("username");
		String passsword=request.getParameter("password");
	
	
		if(AdmissionDao.userlogin(username, passsword))
		{
			pw.print("Welcome");
			RequestDispatcher rd=request.getRequestDispatcher("home.html");
			rd.forward(request, response);
		}
		else
		{
			pw.print("please enter valid username and password");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);

		}
	}

}
