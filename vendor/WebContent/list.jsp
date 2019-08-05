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

<jsp:useBean id="vendor" class="VendorBean.VendorBeanClass"  />
<jsp:setProperty property="*" name="vendor" />
<%--invoke B.L method of JB --%>
<center>
<table border='2px' bgcolor='green' cellspacing='0'>
<tr><th>Name</th><th>Email</th><th>City</th><th>Phone</th><th>Delete</th></tr>
<c:forEach var="cat" items="${vendor.helloVendor()}">
	<tr><td>${cat.name}</td>
	<td>${cat.email}</td>
	<td>${cat.city}</td>
	<td>${cat.phoneno}</td>
	<td><a href='delete.jsp?vid=${cat.name}'>delete</td>
		</tr>
	</c:forEach>
	
</table></center>





</body>
</html>