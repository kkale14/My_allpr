package myypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Myservprogram extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	public void init() throws ServletException {
//        System.out.println("Servlet is initializing...");
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Hello, Servlet is working!</h2>");
        
       
//        String name = request.getParameter("username");
//
//        
//        out.println("<html><body>");
//        out.println("<h2>Hello, " + name + "! Welcome to the servlet response.</h2>");
//        out.println("</body></html>");
//
//        System.out.println("Processing request for: " + name);
	}

//	public void destroy() {
//		// TODO Auto-generated method stub
//		System.out.println("Servlet is being destroyed...");
//	}

}