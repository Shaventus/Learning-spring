<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>

    <form action="logout" method="post">
        <input type="submit" value="Sign Out"/>
    </form>

<h1>User list</h1>

      <table border = "1" width = "100%">
         <tr>
            <th>ID</th>
            <th>Name</th>
         </tr>
         
         <c:forEach var = "list" items = "${list}">
            <tr>
               <td><c:out value = "${list.idUser}"/></td>
               <td><c:out value = "${list.name}"/></td>
            </tr>
         </c:forEach>
      </table>
      
</body>
</html>