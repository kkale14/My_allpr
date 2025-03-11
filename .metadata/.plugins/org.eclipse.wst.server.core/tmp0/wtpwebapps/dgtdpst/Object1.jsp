<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


  <%
  String age = request.getParameter("a");
  int a;
  
  a = Integer.parseInt(age); 
  if (a > 18) {
      out.println("Valid");
     
 //     session.setAttribute("name", "kalyani");
 
      pageContext.setAttribute("value","kalyani",PageContext.APPLICATION_SCOPE);
      
      pageContext.setAttribute("value","kale",PageContext.SESSION_SCOPE);
      
      pageContext.setAttribute("value","6",PageContext.PAGE_SCOPE);
      
      pageContext.setAttribute("value","7",PageContext.REQUEST_SCOPE);
      
     response.sendRedirect("Getfile.jsp");
  } else {
     out.println("Invalid");
    // response.sendRedirect("Conerror.jsp");
  }
%>







</body>
</html>