package Package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Secondserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	public Secondserv() {
		super();
	}
	
    public void init(ServletConfig config) throws ServletException{
    	
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pwd= response.getWriter();
		
		String s1=request.getParameter("datafromhtml");
		pwd.println("<html><body>");
		pwd.println("<h3 Hiii "+s1+" This is GET Response<h3>");
		pwd.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
