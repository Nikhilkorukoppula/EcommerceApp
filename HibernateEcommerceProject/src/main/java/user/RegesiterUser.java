package user;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/user")
public class RegesiterUser extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		 String email=req.getParameter("email");
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String mob=(req.getParameter("mob"));
			String gen=req.getParameter("gender");
			String passwd=req.getParameter("psw");
		    try {
		    	  Class.forName("oracle.jdbc.driver.OracleDriver");  
		          Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil");  
			    String query="insert into commerence values(?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				
				ps.setString(1,email);
				ps.setString(2,fname);
				ps.setString(3,lname);
				ps.setString(4,mob);
				ps.setString(5, gen);
				ps.setString(6,passwd);
				
				int i=ps.executeUpdate();
				if(i>0)
				{
					out.println("susscesfully registerd");
					out.println("<a href=UserRegeister.html>back</a>");
					
					/*
					 * out.println("<html><body><br>");
					 * out.println("Click here to Login with your credentials  "+"<br>");
					 * out.println("<a href=\"Login.html\">LOGIN</a>"+" <br>");
					 * out.println("you are successfully regesitered with following details"+"<br>")
					 * ; out.println("<div>"); out.println("<table border=1><tr>" +
					 * "<td><b>E-MAIL</b></td>" + "<td><b>FIRSTNAME</b></td>" +
					 * "<td><b>LASTNAME</b></td>" + "<td><b>MOBILENUMBER</b></td>" +
					 * "<td><b>GENDER</b></td>" + "<td><b>PASSWORD</b></td></tr>");
					 * out.println("<tr>" + "<td>" + email + "</td>" + "<td>" + fname + "</td>" +
					 * "<td>" + lname + "</td>" + "<td>" + mob + "</td>" + "<td>" + gen + "</td>" +
					 * "<td>" + passwd + "</td></tr>"); out.println("</div>");
					 * 
					 */
				}
				
				
				
				/* out.println("</body></html>"); */
		    }
		    
		    catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
	}

}
