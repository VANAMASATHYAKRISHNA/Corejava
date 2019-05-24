<%@page import="com.sathya.model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<table  border="1">
<tr>
<th>
CategoryId
</th>
<th>
CategoryName
</th>
<th>
CategoryDiscription
</th>
<body>
<%
List<Category> list=(List)request.getAttribute("catlist"); 
for(Category categorylist:list)
{
	%>
	<tr>
	<td><%out.println(categorylist.getCategoryId());%> </td>
	<td><%out.println(categorylist.getCategoryname());%> </td>
	<td><%out.println(categorylist.getCategoryDiscription());%> </td>
	</tr>
	<%
	} %>



</body>
</html>