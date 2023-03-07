package com.hibernate.dao;
import java.io.*; 
import java.sql.*; 
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.hibernate.entities.Product;



public class InterfacesDAOImpl  {

	
	  public static List<Product> getAllMobile() throws Exception { 
		  List<Product> list = new  ArrayList<Product>();
   try {
	  Class.forName("oracle.jdbc.driver.OracleDriver"); 
	  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Nikhil","nikhil"); 
	  PreparedStatement pstmt =con.prepareStatement("select * from Pmobile"); 
	  ResultSet rs = pstmt.executeQuery(); 
	  while(rs.next()) { 
		  Product p = new Product();
	  p.setId(rs.getInt(1));
	  
	 
	 p.setImage(rs.getBytes(2));
	 p.setProductName(rs.getString(3));
	 p.setProductDescription(rs.getString(4));
	 p.setProductPrice(rs.getDouble(5));
	  list.add(p); 
	  } 
} 
	  catch (Exception e) {
	             e.printStackTrace(); 
	             }
	  
	  return list; }
} 
	
	 

