<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Comenzando con Spring MVC</title>
 </head>
 <body>
 <form action="/almacenar">
  <h1 style="color: green; text-align: center;">Ficha del alumno ${nombre}</h1>
    
    <textarea  value="/almacenar/bueno" cols="60" rows="10" var="item" name="nota">${item}
      
    </textarea>
     
    <input id="submit" type="submit" tabindex="5" value="almacenar">
 </form>
 </body>
</html>
