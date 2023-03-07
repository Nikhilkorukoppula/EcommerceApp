<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="com.hibernate.dao.*,com.hibernate.entities.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="external.css">
<meta charset="ISO-8859-1">
<title>Mobiles</title>
</head>
<body background="https://png.pngtree.com/thumb_back/fh260/background/20210207/pngtree-yellow-solid-color-background-simple-image_557001.jpg">
<%  
List<Product>list=InterfacesDAOImpl.getAllMobile();  
request.setAttribute("list",list);  
%>
  <h1><P align="center"> ECOMMERCE MALL</P></h1>
<font color="red"><marquee behavior="scroll" direction="right">50% discount on 1st order</marquee></font>
<div class="topnav">
  <a href="index.html">Home</a>

  <div class="dropdown">
    <button class="dropbtn">Category 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">Mobiles</a>
      <a href="electronics.html">Electronics</a>
       <a href="medical.html">Medical store</a>
   <a href="#">Cloths and Accessories</a>
    </div>
  </div> 

  <a href="#about">About</a>
  <a href="#contact">Contact</a>
   <a href="homepage.html">Logout</a>
  <div class="search-container">
    <form action="www.google.com">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
    </form>
  </div>
</div>

<c:forEach  items="${list}" var="l">
<img src="https://i.gadgets360cdn.com/products/large/motorola-edge-30-pro-657x800-1645713862.jpg?downsize=*:180"width="150" height="200"><br>

                <div id="left"> 
     <img src="${l.getImage()} alt="deleted" /><br>
                   ${l.getProductName()}<br>
                   </div>
                 
                 <div id="middle"> ${l.getProductDescription()} <br>
                 ${l.getProductPrice()}/-
                 </div>  
                
          
             
            </c:forEach><br>
          
   
</body>
</html>