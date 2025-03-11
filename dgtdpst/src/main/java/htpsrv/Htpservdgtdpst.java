package htpsrv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Htpservdgtdpst
 */

public class Htpservdgtdpst extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Htpservdgtdpst() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//res.getWriter().append("Served at: ").append(req.getContextPath());
		
		res.setContentType("text/html");  
	//	Cookie userCookie = new Cookie("username", "Kalyani");
        
        PrintWriter out2 = res.getWriter();

        // Print message for GET request
        out2.println("Handling GET Request");
        out2.println("You sent a GET request!");
        
      //  String v="Kalyani";
        String name1=req.getParameter("data2");
        
        out2.println("<html><body>");
		out2.println("<h3>Hello,"+name1+"Welcome to GET Method</h2>");
		out2.println("</body></html>");
		
        
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pwd=response.getWriter();
		
		String name=request.getParameter("data");
		pwd.println("<html><body>");
		pwd.println("<h3>Hello,"+name+"Welcome to post Method</h2>");
		pwd.println("</body></html>");
		
	}

}
