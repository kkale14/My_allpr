package Second;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Demo1 extends HttpServlet {

    // This method is called when a GET request is received
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the response content type to HTML
        response.setContentType("text/html");
        
        // Get the output stream to write to the response
        PrintWriter out = response.getWriter();
        
        // Write the HTML content to the response
        out.println("<html>");
        out.println("<head><title>Servlet DoGet Example</title></head>");
        out.println("<body>");
        out.println("<h2>Hello, welcome to the Doget example!</h2>");
        
        // Directly fetch the 'name' parameter from the URL
        String name = request.getParameter("name");
        out.println("<p>Welcome, " + (name != null ? name : "Guest") + "!</p>");
        
        out.println("</body>");
        out.println("</html>");
        
        out.close();  // Close the output stream
    }
}
