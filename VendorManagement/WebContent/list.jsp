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

<jsp:useBean id="vendor" class="VendorBean.VendorBeanClass" scope="session" />
<jsp:setProperty property="*" name="vendor" />
<%--invoke B.L method of JB --%>
<form>
<table border='2px'>
<tr><th>Id</th><th>Name</th><th>Email</th><th>City</th><th>Phone</th><th>Delete</th><th>Update</th><th>Details</th></tr>
<c:forEach var="cat" items="${sessionScope.vendor.helloVendor()}">
	<tr>
	<td>${cat.id}</td>
	<td>${cat.name}</td>
	<td>${cat.email}</td>
	<td>${cat.city}</td>
	<td>${cat.phoneno}</td>
	<td><a href='deletevendor.jsp?id=${cat.id}'>delete</a></td>
	<td><a href='updateVendor.jsp?id=${cat.id}'>update</a></td>
	<td><a href='detail.jsp?id=${cat.id}'>detail</a></td>
	
	</tr>
	</c:forEach>
</table>
<a href="registervendor.jsp">Add New Vendor</a>
</form>





</body>
</html>