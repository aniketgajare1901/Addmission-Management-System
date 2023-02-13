package Admission.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admission.Bo.AddBo;
import Admission.Dao.AdmissionDao;

/**
 * Servlet implementation class signupController
 */
@WebServlet("/signupController")
public class signupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("name");
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
	    String email=request.getParameter("email");
	    String phone=request.getParameter("phone");
	    
	    
	    AddBo ab=new AddBo();
	    //AddBo ab=new AddBo();
	    ab.setName(name);
	    ab.setUsername(username);
	    ab.setPassword(password);
	    ab.setEmail(email);
	    ab.setPhone(phone);
	    
	    int status=AdmissionDao.signup(ab);
	    if(status>0)
	    {
	    	pw.write("Signup Successfully Done !!!!");
	    }
	    else
	    {
	    	pw.write("Something Wrong please check it ");
	    }
	}

}
