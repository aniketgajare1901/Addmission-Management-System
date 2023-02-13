package Admission.controler;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admission.Bo.StudentBo;
import Admission.Dao.AdmissionDao;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		 PrintWriter pw=response.getWriter();
		
		 
	      String id=request.getParameter("id");
         
	      int eid= Integer.parseInt(id);
	    
	      StudentBo eb= AdmissionDao.getEmployeeById(eid);
	    

		pw.print("<form  action='UpdateController' method='get'> ");
	    
		pw.print("<table>");
		
		pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+eb.getId()+"'/></td></tr>");  
		pw.print("<tr><td>Name: </td> <td><input type='text' name='fname' value='"+eb.getFname()+"'/></td></tr>");
		pw.print("<tr><td>SurName: </td> <td><input type='text' name='lname' value='"+eb.getLname()+"'/></td></tr>");

	   	pw.print("<tr><td>Email: </td> <td><input type='text' name='email' value='"+eb.getEmail()+"'/></td></tr>");
	   	pw.print("<tr><td>Phone:</td> <td><input type='text'  name='phone' value='"+eb.getPhone()+"'/></td></tr>");
	   	pw.print("<tr><td>Gender:</td> <td><input type='text'  name='gender' value='"+eb.getGender()+"'/></td></tr>");
	
	   	pw.print("<tr><td>Date of join: </td> <td><input type='text' name='DOB' value='"+eb.getDOB()+"'/></td></tr>");
	   	pw.print("<tr><td>Address:</td> <td><input type='text'  name='address' value='"+eb.getAddress()+"'/></td></tr>");

	   	pw.print("<tr><td>City: </td> <td><input type='text' name='city' value='"+eb.getCity()+"'/></td></tr>");
	   	pw.print("<tr><td>Pin:</td> <td><input type='text'  name='pin' value='"+eb.getPin()+"'/></td></tr>");
	   	pw.print("<tr><td>State:</td> <td><input type='text'  name='state' value='"+eb.getState()+"'/></td></tr>");
	   	pw.print("<tr><td>Country:</td> <td><input type='text'  name='county' value='"+eb.getCountry()+"'/></td></tr>");
	   	pw.print("<tr><td>Hobbies:</td> <td><input type='text'  name='hobbies' value='"+eb.getHobbies()+"'/></td></tr>");
	   	pw.print("<tr><td>Qualification:</td> <td><input type='text'  name='qualification' value='"+eb.getQulification()+"'/></td></tr>");
	   	pw.print("<tr><td>Course:</td> <td><input type='text'  name='course' value='"+eb.getCourse()+"'/></td></tr>");


		
	    pw.print("<tr><td><input type='submit' value='Edit '/></td></tr>"); 
	    
	   	pw.print("</table>");
		
		pw.print("</form>");
	
	}
	
	}


