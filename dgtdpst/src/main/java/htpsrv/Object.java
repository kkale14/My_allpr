package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Object  extends HttpServlet{

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 
		 String name=request.getParameter("xyz");
		 PrintWriter pwd=response.getWriter();
		 pwd.println("Value is : "+name);
		 
		 RequestDispatcher reqd2= request.getRequestDispatcher("/Object1.jsp");
	       reqd2.forward(request, response);
	       
		 
	 }
	 
	 
}


