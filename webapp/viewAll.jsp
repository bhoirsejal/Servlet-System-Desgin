<%@page import="com.jsp.dto.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.jsp.service.StudentService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All</title>
</head>
<body>

	<% StudentService studentService = new StudentService(); %>
	<% List<Student> students = studentService.getAllStudents();%>
	

	<table border="1" style="border-collapse: collapse;">
		<tr style="text-align: center;">
			<th><%="id"%></th>
			<th><%="name"%></th>
			<th><%="email"%></th>
			<th><%="loc"%></th>
		</tr>
		
		<%	for (Student student : students) {	%>
	
		<tr>	
			<td><%= student.getId() %> </td>
			<td><%= student.getName() %> </td>
			<td><%= student.getEmail() %></td>
			<td><%= student.getLoc() %></td>
		</tr>
			<%	}	%>
	</table>


</body>
</html>