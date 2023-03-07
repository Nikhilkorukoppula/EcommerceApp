<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><head><title>Homepage</title>

<link rel="stylesheet" href="external.css">
</head>
<body background="https://wallpaperaccess.com/full/2593068.jpg">

<center><h1> ECOMMERCE MALL</h1></center>
<font color="red"><marquee behavior="scroll" direction="right">50% discount on 1st order</marquee></font>
<div class="topnav">
  <a href="#">Home</a>

  <div class="dropdown">
    <button class="dropbtn">Category 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="list.jsp">Mobiles</a>
      <a href="#">Electronics</a>
       <a href="#">Medical store</a>
   <a href="#">Cloths and Accessories</a>
    </div>
  </div> 

  <a href="#about">About</a>
  <a href="#contact">Contact</a>
   <a href="homepage.html">Logout</a>
   <div class="dropdown">
    <button class="dropbtn">Update 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="UpdateAdmin.jsp">Admin</a>
      <a href="UpdateAdmin.jsp">user</a>
       
    </div>
  </div> 
  <div class="search-container">
    <form action="https://www.google.com/search?sxsrf=AJOqlzXprhQ9jBx__OBgW-fKPcLq--SMMA:1678105634191&q=google+homepage&spell=1&sa=X&ved=2ahUKEwiExOLRpsf9AhWvR2wGHROYBRgQBSgAegQIBxAB&biw=1294&bih=593&dpr=1">
      <input type="text" placeholder="Search.." name="search">
      <button type="submit"><i class=" fa-search" aria-hidden="false" style=color:red></i></button>
    </form>
  </div>
</div>
</body>
</html>
