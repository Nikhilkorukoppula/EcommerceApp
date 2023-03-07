package user;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/AllUserDetails")
public class AllUserDetails extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	     PrintWriter out = response.getWriter();
	     
	    out.println("<html><body>");
	     out.println("<h3>Fetching All Details</h3>");
	     out.println("<table border=1><tr>" + "<td><b>E-MAIL</b></td>" + "<td><b>FIRSTNAME</b></td>"
	             + "<td><b>LASTNAME</b></td>" + "<td><b>MOBILENUMBER</b></td>"
	             + "<td><b>GENDER</b></td>" + "<td><b>PASSWORD</b></td></tr>");
	    
			String query="select * from commerence";
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");  
		          Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil"); 
				PreparedStatement ps=con.prepareStatement(query);
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					String email=rs.getString(1);
					String fname=rs.getString(2);
					String lname=rs.getString(3);
					String mob=rs.getString(4);
					String gen=rs.getString(5);
					String passwd=rs.getString(6);
					out.println("<tr>" + "<td>" + email + "</td>" + "<td>" + fname + "</td>" + "<td>" + lname + "</td>"
	                        + "<td>" + mob + "</td>" + "<td>" + gen + "</td>" + "<td>" + passwd
	                        + "</td></tr>");
				}
				out.println("</table></body></html>");
				 rs.close();
		            ps.close();
		            out.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
	}
}
