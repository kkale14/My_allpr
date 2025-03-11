package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Htpsrvwithanno
 */
//@WebServlet("/mainpage")
public class Htpsrvwithanno extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Htpsrvwithanno() {
        super();
    }

    // Handles GET requests
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");  

        PrintWriter out2 = res.getWriter();
        
        // Get the 'data2' parameter from the query string
        String name1 = req.getParameter("data2");
        
        out2.println("<html><body>");
        out2.println("<h3>Hello, " + name1 + " Welcome to GET Method</h3>");
        out2.println("</body></html>");
    }

    // Handles POST requests
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pwd = res.getWriter();
        
        // Get the 'data' parameter from the POST request body
        String name = req.getParameter("data");
        
        pwd.println("<html><body>");
        pwd.println("<h3>Hello, " + name + " Welcome to POST Method</h3>");
        pwd.println("</body></html>");
    }
}

