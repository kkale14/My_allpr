package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Errorhandler  extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		
		 response.setContentType("text/html");
	        
	     
	        PrintWriter pwd = response.getWriter();
	        
	        try {
	          
	            int result = 10 / 0;
	            
	            System.out.println("<h2>Here  error occurred</h2>");

	        } catch (Exception e) {
	        	
	        	//request.setAttribute("errorMessage", e.getMessage());
	        	pwd.println("<h4>An error occurred: </h4>");
	        	
	            pwd.println("<h3>Error is </h3>" + e.getMessage() );

	            
	            
	        }
	        
	        response.sendRedirect("Login.html");
	        
	        
	      //  RequestDispatcher reqd=request.getRequestDispatcher("/Login.html");
	       // reqd.forward(request,response);
	       
	}
}
