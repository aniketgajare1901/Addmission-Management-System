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
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String gender=request.getParameter("gender");
		String DOB=request.getParameter("DOB");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String pin=request.getParameter("pin");
		String state=request.getParameter("state");
		String county=request.getParameter("county");
		String hobbies=request.getParameter("hobbies");
		String qualification=request.getParameter("qualification");
		String course=request.getParameter("course");



		
		StudentBo eb=new StudentBo();
//		eb.setFname(fname);
//		eb.setLname(lname);
//		eb.setEmail(email);
//		eb.setPhone(phone);
//		eb.setGender(gender);
//		eb.setDOB(DOB);
//		eb.setAddress(address);
//		eb.setCity(city);
//		eb.setPin(pin);
//		eb.setState(state);
//		eb.setCountry(county);
//		eb.setHobbies(hobbies);
//		eb.setQulification(qualification);
//		eb.setCourse(course);
		
		eb.setFname(fname);
		eb.setLname(lname);
		eb.setEmail(email);
		eb.setPhone(phone);
		eb.setGender(gender);
		eb.setDOB(DOB);
		eb.setAddress(address);
		eb.setCity(city);
		eb.setPin(pin);
		eb.setState(state);
		eb.setCountry(county);
		eb.setHobbies(hobbies);
		eb.setQulification(qualification);
		eb.setCourse(course);
		
		int status=AdmissionDao.AddStudent(eb);
		if(status>0)
		{
			pw.print("Data sucessfully inserted");
		}
		else
		{
			pw.print("Wrong");
		}
		}

	
	}


