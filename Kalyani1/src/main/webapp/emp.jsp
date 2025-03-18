<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.List,first.Adminandstdmodel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<thead>
<tr><th>ID</th><th>Name</th><th>Username</th><th>Email</th><th>Role</th></tr>

</thead>
<tbody>
<%

		List<Adminandstdmodel> students=(List<Adminandstdmodel>)  request.getAttribute("students");
		if(students!=null)
		{
			for(Adminandstdmodel student:students)
			{%>
			<tr>
				<td><%=  student.getId()  %></td>
				<td><%=  student.getName()  %></td>
				<td><%=  student.getUsername()  %></td>
				<td><%=  student.getEmail()  %></td>
				<td><%=  student.getRole()  %></td>
				</tr>
	   <% } 
		}
		else{ %>
		<tr><td colspan="5"> No Students</td></tr>
		<% } %>
			</tbody>
			</table>





</body>
</html>