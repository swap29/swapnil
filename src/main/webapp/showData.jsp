<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1>Hiiiiiiiiii</h1>


${user}

 <br>
 <br>
 <%-- 
<form:form action="reg">
   <table>
   
   
        <tbody>
         <c:forEach var="emp" items="${user}">  
         <tr>  
   <td>${emp.id}</td>  
   <td>${emp.username}</td>  
   <td>${emp.password}</td>  
    
   </tr>  
         </c:forEach> 
        
        </tbody>
   
   </table>

<input type="submit" value="Submit">



</form:form> --%>
<a href="updateData.jsp">Update	Data</a>
<br>
<br>

<a href="register.jsp">Register Page</a>
</body>
</html>