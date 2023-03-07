package com.admindao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	public static boolean validate(String lname,String pass){  
		boolean status=false;  
		try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","Nikhil","nikhil");  
		      
		PreparedStatement ps=con.prepareStatement("select * from registration where lname=? and PASS=?");  
		ps.setString(1,lname);  
		ps.setString(2,pass);  
		      
		ResultSet rs=ps.executeQuery();  
		status=rs.next();  
		          
		}catch(Exception e){System.out.println(e);}  
		return status;  
		}  
		} 

