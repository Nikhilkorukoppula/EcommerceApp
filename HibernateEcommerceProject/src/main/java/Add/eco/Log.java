package Add.eco;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.admindao.Admin;

@WebServlet("/log")
public class Log extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		res.setContentType("text/html");
	    PrintWriter out = res.getWriter();
	   
	   
			String lname=req.getParameter("name");
			String pass=req.getParameter("pass");
			 if(Admin.validate(lname, pass)){  
				 out.println("homepage");
			       RequestDispatcher rd=req.getRequestDispatcher("main.jsp"); 
			        out.println("<a href=UpdateAdmin.jsp>update</a>");
			        rd.forward(req,res);  
			    }  
			    else{  
			        out.print("Sorry username or password error");  
			        RequestDispatcher rd=req.getRequestDispatcher("AdminLog.jsp");  
			        rd.include(req,res);  
			    }  
			          
			    out.close(); 
	
	}

}
