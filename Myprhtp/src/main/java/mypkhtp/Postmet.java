package mypkhtp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Postmet extends HttpServlet {

	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/plain");  // Plain text for console printing

        // Get the output stream to send the response to the client
        PrintWriter out = response.getWriter();

        // Print message for POST request
        out.println("Handling POST Request");
        out.println("You sent a POST request!");
		
		
	}
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
        res.setContentType("text/plain");  

        
        PrintWriter out2 = res.getWriter();

        // Print message for GET request
        out2.println("Handling GET Request");
        out2.println("You sent a GET request!");
	}
}
