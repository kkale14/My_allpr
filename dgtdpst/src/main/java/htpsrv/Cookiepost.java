package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookiepost extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Getting form parameters
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        // Set the content type to display the result in HTML format
        response.setContentType("text/html");
        
        Cookie userCookie = new Cookie("username", username);
        
        Cookie email2=new Cookie("email",email);
        
        response.addCookie(userCookie);
        response.addCookie(email2);
        
        PrintWriter pwd=response.getWriter();
        
     // RequestDispatcher reqd2= request.getRequestDispatcher("/Login.html");
       //reqd2.forward(request, response);
        pwd.println("Welcome to Cookie1 Code");
        
       // RequestDispatcher reqd= request.getRequestDispatcher("/Login.html");
        //reqd.forward(request, response);
        
       
        response.sendRedirect("Login.html");
        // Write the response
        pwd.println("<html><body>");
        pwd.println("<h2>Form Submitted Successfully</h2>");
        pwd.println("<p>Username: " + username + "</p>");
        pwd.println("<p>Email: " + email + "</p>");
        pwd.println("</body></html>");
    }
	
}
