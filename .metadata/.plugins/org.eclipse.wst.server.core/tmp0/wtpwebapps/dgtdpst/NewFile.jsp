<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<pre>

<%    

		int a=5;
		int b=10;
		
		out.println("Ans is:" + (a+b));

		
		
		
		out.println("PATTERN");
	
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				out.print("*");
			}
			out.println();
			
		
		}
		

		
		out.println("IF ELSE CODE");
		
	
		int c=10,k=10;
		if(c==10)
		{
			out.println("Same number");
		}
		else
		{
			out.println("Not Same number");
		}
%>
</pre>
 
<%= "hello" %>

<%! 

int count=0;

void increment()
{
for(int x=1;x<=5;x++)
  {
	count++;
	//out.print("Count value is" +count);
  }

	
}


%>
<%

out.print("Count value is" +count);

%>




</body>
</html>