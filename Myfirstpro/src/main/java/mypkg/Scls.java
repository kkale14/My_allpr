package mypkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Scls implements Servlet {
	private static final long serialVersionUID = 1L;

    
    public Scls() {
        
    }


	@Override
	public void destroy() {
		
		
	}


	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}


	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		System.out.print("servlet Initialization");
		
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<h2>Hiii servlet working</h2>");
		String data1= req.getParameter("data");
		pw.println("<html><body>");
		pw.println("<h2>Hello, "+ data1 +" This is your response</h2>");
		pw.println("</body></html>");
		
		
		
		System.out.print("servlet Initialization "+data1);
		
		
		
		
	}

	
	

}
