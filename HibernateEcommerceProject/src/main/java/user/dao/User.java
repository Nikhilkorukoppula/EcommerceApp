package user.dao;
import java.sql.*;
public class User{

	public static boolean validate(String email,String passwd){  
	boolean status=false;  
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil");  
	      
	PreparedStatement ps=con.prepareStatement("select * from commerence where EMAIL=? and PASSWD=?");  
	ps.setString(1,email);  
	ps.setString(2,passwd);  
	      
	ResultSet rs=ps.executeQuery();  
	status=rs.next();  
	          
	}catch(Exception e){System.out.println(e);}  
	return status;  
	}  
	}  

