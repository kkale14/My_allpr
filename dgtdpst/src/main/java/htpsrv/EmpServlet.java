package htpsrv;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import htpsrv.EmpServlet;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	
	private Service service;
	
	public void init() {
		
		service =new Service();
	
	}
	
	
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		
		try {
			
			List<Employee> employee=service.getAllEmployee();
			
			request.setAttribute("empl", employee);
			
			RequestDispatcher rsd= request.getRequestDispatcher("emp.jsp");
			rsd.forward(request, response);
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			
		}
	
		
	}
	

}
