package Admission.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admission.Bo.StudentBo;
import Admission.Dao.AdmissionDao;


/**
 * Servlet implementation class AllStudentController
 */
@WebServlet("/AllStudentController")
public class AllStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AllStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<link rel='stylesheet' href='css/table.css'>");

		
		
	pw.print("<a href='home.html'></a>");
	pw.print("<table border='1px' width='100%'>");
	pw.print("<tr><th>Id</th> <th>Name</th><th>Surname</th> <th>Email</th> <th>Phone</th> <th>Gender</th> <th>Date of Join</th> <th>Address</th><th>City</th> <th>Pin</th> <th>State</th>  <th>Country</th> <th>Hobbies</th> <th>Qualification</th>  <th>Course</th><th>Action</tr>");
	
	List<StudentBo>  list=AdmissionDao.AllStudent();
	for(StudentBo eb:list)
	{
		pw.print("<tr><td>"+eb.getId()+"</td><td>"+eb.getFname()+"</td><td>"+eb.getLname()+"</td><td>"+eb.getEmail()+"</td><td>"+eb.getPhone()+"</td><td>"+eb.getGender()+"</td><td>"+eb.getDOB()+"</td><td>"+eb.getAddress()+"</td> <td>"+eb.getCity()+"</td> <td>"+eb.getPin()+"</td> <td>"+eb.getState()+"</td> <td>"+eb.getCountry()+"</td> <td>"+eb.getHobbies()+"</td> <td>"+eb.getQulification()+"</td> <td>"+eb.getCourse()+"</td> <td><a href='EditController?id="+eb.getId()+"'> edit </a></td> <td><a href='DeleteController?id="+eb.getId()+"'>Delete </a></td></tr>"); 
		  
	  }
	   
	  pw.print("</table>");
    pw.print("<a href=\"home.html\">Back</a>");

	}
	
	
	}


