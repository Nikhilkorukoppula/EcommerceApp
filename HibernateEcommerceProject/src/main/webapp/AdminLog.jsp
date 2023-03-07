<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .GFG {
            background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer; 
        }
       #gg
       {
       background-color: white;
            border: 2px solid black;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer; 
       border-radius: 10%;
       }
     .GG
     {
      background-color: transparent;
            border: 2px solid transparent;
            color: green;
            padding: 5px 10px;
            text-align: center;
            display: inline-block;
            font-size: 20px;
            margin: 0px 0px;
            cursor: pointer;   
        
     }  
  .GG:hover {
	background-color:rgb(240, 240, 240) ;
	
}
    </style>
</head>
<body style="background: rgba(0, 128, 0, 0.3)">

<form action="log" >

<br><br>
<input class="GFG" type="text" name="name" placeholder="USERNAME" required><br><br>
<input class="GFG" type="password" name="pass" placeholder="P A S S W O R D" required><br><br>
<input  id="gg" type="submit" value="LOGiN">&nbsp;&nbsp;
<input id="gg" type="reset" value="CLEaR">
<br><br>
</form>
<a href="AdminReg.jsp"><button class="GG">Register</button></a><br>
<a href="Forgot.jsp"><button class="GG" >ForgotPassword</button> </a>
</body>
</html>