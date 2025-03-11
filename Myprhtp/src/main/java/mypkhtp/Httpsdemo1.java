package mypkhtp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Httpsdemo1 extends HttpServlet {
	
	
	

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	System.out.println("Get request process");
	res.getWriter().write("Hello Servlet");
       
	}
	
	
	
	
}
