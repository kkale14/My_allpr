

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1  extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type to HTML
        response.setContentType("text/html");

        // Get session object (creates one if doesn't exist)
        HttpSession session = request.getSession(false);

        // Retrieve user data from session
        String userName = (String) session.getAttribute("Kalyani");

        // If no session data, prompt for input
        if (userName == null) {
            userName = "Kalyani";
        }

        // Write response to browser
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Welcome, " + userName + "</h2>");
        out.println("<form action='setSession' method='post'>");
        out.println("Enter your name: <input type='text' name='data'/>");
        out.println("<input type='submit' value='Set Name'/>");
        out.println("</form>");
        out.println("</body></html>");
    }

	

}
