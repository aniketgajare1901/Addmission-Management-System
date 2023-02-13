package Admission.Dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Admission.Bo.AddBo;
import Admission.Bo.StudentBo;

public class AdmissionDao {

	
	
	public static Connection getConnection()
	{
		Connection con=null;
		
		try
		{
			String url="jdbc:mysql://localhost:3306/admission";
			String username="root";
			String password="vicky1901";
	        Class.forName("com.mysql.cj.jdbc.Driver");  
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
		
		
	}

	public static int signup(AddBo ab) {
int status=0;

try
{
	Connection con=AdmissionDao.getConnection();
	String sql="insert into Addinfo(name,username,password,email,phone) values(?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1,ab.getName());
	ps.setString(2,ab.getUsername());
	ps.setString(3, ab.getPassword());
	ps.setString(4,ab.getEmail());
	ps.setString(5,ab.getPhone());
	status=ps.executeUpdate();
}
catch(Exception e)
{
	System.out.println("Chuktay bho");
}
return status;

	
	}
	
	public static boolean userlogin(String username ,String password)
	{
		boolean status=false;
		try
		{
			Connection con=AdmissionDao.getConnection();
			String sql="select * from  addinfo where username=? and password=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
		}
		catch(Exception e)
		{
			System.out.println("Wrong.............!");
		}
		return status;
		
	}
	
	
	
	
	
	public static int AddStudent(StudentBo eb)
	{
		int status=0;
		try
		{
          Connection con=AdmissionDao.getConnection();
          String query="insert into studentinfo(fname,lname,email,phone,gender,DOB,address,city,pin,state,county,hobbies,qualification,course) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(query);
         ps.setString(1,eb.getFname());
         ps.setString(2, eb.getLname());
         ps.setString(3, eb.getEmail());
         ps.setString(4, eb.getPhone());
         ps.setString(5, eb.getGender());
         ps.setString(6, eb.getDOB());
         ps.setString(7, eb.getAddress());
         ps.setString(8, eb.getCity());
         ps.setString(9, eb.getPin());
         ps.setString(10, eb.getState());
         ps.setString(11, eb.getCountry());
         ps.setString(12, eb.getHobbies());
         ps.setString(13, eb.getQulification());
         ps.setString(14, eb.getCourse());
         
          status =ps.executeUpdate();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	
}
	
	
	
	
	
	public static List AllStudent()
	{
		List<StudentBo> list=new ArrayList<StudentBo>();
		
		try
		{
			Connection con=AdmissionDao.getConnection();
			 PreparedStatement ps=con.prepareStatement("select * from studentinfo");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			StudentBo eb=new StudentBo();
			eb.setId(rs.getInt(1));
			eb.setFname(rs.getString(2));
			eb.setLname(rs.getString(3));
			eb.setEmail(rs.getString(4));
			eb.setPhone(rs.getString(5));
			eb.setGender(rs.getString(6));
			eb.setDOB(rs.getString(7));
			eb.setAddress(rs.getString(8));
			eb.setCity(rs.getString(9));
			eb.setPin(rs.getString(10));
            eb.setState(rs.getString(11));
            eb.setCountry(rs.getString(12));
            eb.setHobbies(rs.getString(13));
			eb.setQulification(rs.getString(14));
			eb.setCourse(rs.getString(14));
			list.add(eb);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return list;
		
	}

	public static StudentBo getEmployeeById(int id) {
			
		StudentBo eb=new StudentBo();
			try
			{
			Connection con=AdmissionDao.getConnection();
			String query="select * from studentinfo where id=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{

				eb.setId(rs.getInt(1));
                eb.setFname(rs.getString(2));
                eb.setLname(rs.getString(3));
   				eb.setEmail(rs.getString(4));
				eb.setPhone(rs.getString(5));
				eb.setGender(rs.getString(6));
				eb.setDOB(rs.getString(7));
				eb.setAddress(rs.getString(8));
				eb.setCity(rs.getString(9));
				eb.setPin(rs.getString(10));
				eb.setState(rs.getString(11));
				eb.setCountry(rs.getString(12));
				eb.setHobbies(rs.getString(13));
				eb.setQulification(rs.getString(14));
				eb.setCourse(rs.getString(15));
			}
				
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			return eb;
		}
		
	

	public static int Update(StudentBo eb) {
		int status=0;
		try
		{
			Connection con=AdmissionDao.getConnection();
			
			String query="update studentinfo set fname=?,lname=?,email=?,phone=?,gender=?,DOB=?,address=?,city=?,pin=?,state=?,county=?,hobbies=?,qualification=?,course=? where id=?";
			
			PreparedStatement ps=con.prepareStatement(query);

			
			ps.setString(1,eb.getFname());
			ps.setString(2,eb.getLname());
			ps.setString(3,eb.getEmail());
			ps.setString(4,eb.getPhone());
			ps.setString(5, eb.getGender());
			ps.setString(6,eb.getDOB());
			ps.setString(7, eb.getAddress());
			ps.setString(8, eb.getCity());
			ps.setString(9, eb.getPin());
			ps.setString(10, eb.getState());
			ps.setString(11, eb.getCountry());
			ps.setString(12, eb.getHobbies());
			ps.setString(13, eb.getQulification());
			ps.setString(14, eb.getCourse());
			ps.setInt(15, eb.getId());
			
			status=ps.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}

	public static int delete(int id) {
		
		
		
		
		int status=0;
		
		try {
			
			  Connection con=AdmissionDao.getConnection();
			  String query="Delete from studentinfo where id=?";
			  PreparedStatement ps=con.prepareStatement(query);
			  ps.setInt(1, id);
			  status=ps.executeUpdate();
			  
		} catch (Exception e) {
		
			   System.out.println(e);
		}

		return status;	
		
	}
	
	
	}


	
	
	

