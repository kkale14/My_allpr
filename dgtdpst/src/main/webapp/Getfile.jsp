<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%=
//session.getAttribute("name")
pageContext.getAttribute("value",PageContext.APPLICATION_SCOPE)
%>
<%= 
pageContext.getAttribute("value",PageContext.SESSION_SCOPE)
%>

<%= 
pageContext.getAttribute("value",PageContext.PAGE_SCOPE)
%>

<%= 
pageContext.getAttribute("value",PageContext.REQUEST_SCOPE)
%>

int age;

${ param.age > 18 ? "adult" : "minor" ; }




</body>
</html>