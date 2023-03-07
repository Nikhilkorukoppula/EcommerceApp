package user;


import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.dao.User;





@WebServlet("/login")
public class LoginUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
    PrintWriter out = res.getWriter();
   
   
		String email=req.getParameter("email");
		String passwd=req.getParameter("psw");
		 if(User.validate(email, passwd)){  
			 out.println("homepage");
		        RequestDispatcher rd=req.getRequestDispatcher("index.html");  
		        rd.forward(req,res);  
		    }  
		    else{  
		        out.print("Sorry username or password error");  
		        RequestDispatcher rd=req.getRequestDispatcher("Login.html");  
		        rd.include(req,res);  
		    }  
		          
		    out.close(); 
  
}
}
