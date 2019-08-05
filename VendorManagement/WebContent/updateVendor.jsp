<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>


<form action="fetchid.jsp">

<table>
<jsp:setProperty property="id" name="vendor"/>
<tr><td>Name:</td><td><input type="text" name='name' value='${vendor.fetchById().name}' readonly></td></tr>
<tr><td>Email:</td><td><input type="text" name='email' value='${vendor.fetchById().email}' readonly></td></tr>
<tr><td>City:</td><td><input type="text" name='city' value='${vendor.fetchById().city}'></td></tr>
<tr><td>PhoneNo:</td><td><input type="text" name='phoneno' value='${vendor.fetchById().phoneno}'></td></tr>
<tr><td><input type="submit" value="Update"></td></tr>	
</table>

</form>
</body>
</html>