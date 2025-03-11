

//SET COOKIE CODE 



package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        // Set the response content type
        response.setContentType("text/html");
        Cookie[] ck=request.getCookies();
        
        
      
        request.getSession();
        
        Cookie userCookie = new Cookie("username", "Kalyani");

       
        response.addCookie(userCookie);

        // Display a message to the user
       PrintWriter out = response.getWriter();
        RequestDispatcher reqd2= request.getRequestDispatcher("/Login.html");
       reqd2.forward(request, response);
        out.println("<html><body>");
        out.println("<h2>Cookie has been set successfully!</h2>");
        //out.println("<a href='Cookie1'></a>");
        out.println("</body></html>");
        
//for(Cookie c : ck)
        	
        //{
        	//System.out.println("Cookies : "+c.getValue());
      //  }
    }

}
