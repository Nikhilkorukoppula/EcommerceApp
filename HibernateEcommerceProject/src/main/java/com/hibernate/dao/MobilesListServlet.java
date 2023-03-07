
  package com.hibernate.dao; 
  import java.io.*;
import java.sql.*;

   import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet; 
  import javax.servlet.http.*;

  
  
  @WebServlet("/Pro") public class MobilesListServlet extends HttpServlet
  {
  
  private static final long serialVersionUID = 1L; 
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws
  IOException, ServletException {
  
	  final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	    final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
	    final String User = "Nikhil";
	    final String Password = "nikhil";
	    try {
	        Class.forName(JDBC_DRIVER);
	        Connection conn = DriverManager.getConnection(DB_URL, User, Password);

	        PreparedStatement stmt = conn.prepareStatement("select image from Pmobile where ProductName=?");
	        stmt.setLong(1, Long.valueOf(request.getParameter("ProductName")));
	        ResultSet rs = stmt.executeQuery();
	        if (rs.next()) {
	            response.getOutputStream().write(rs.getBytes("image"));
	        }
	        conn.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
 
  }
  
  }  
  
 