package user;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
	 String email=req.getParameter("email");
	 try
	 {
		 Class.forName("oracle.jdbc.driver.OracleDriver");  
         Connection  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil"); 
		 String query="delete * from commerence where EMAIL=?";
		 PreparedStatement ps=con.prepareStatement(query);
          ps.setString(1,email);
          ps.executeUpdate();
          out.close();
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 
}
}
