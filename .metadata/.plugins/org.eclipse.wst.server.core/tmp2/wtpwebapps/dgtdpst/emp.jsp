<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.util.List,htpsrv.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<thead>
<tr><th>DeptID</th><th>Fname</th><th>Lname</th><th>Salary</th></tr>

</thead>
<tbody>
<%

		List<Employee> empl=(List<Employee>)  request.getAttribute("empl");
		if(empl!=null)
		{
			for(Employee emp:empl)
			{%>
			<tr>
				<td><%=  emp.getDeptid()  %></td>
				<td><%=  emp.getFname()  %></td>
				<td><%=  emp.getLname()  %></td>
				<td><%=  emp.getSalary()  %></td>
				</tr>
	   <% } 
		}
		else{ %>
		<tr><td colspan="5"> No Employees</td></tr>
		<% } %>
			</tbody>
			</table>





</body>
</html>