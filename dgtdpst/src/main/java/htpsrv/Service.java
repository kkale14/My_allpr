package htpsrv;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServlet;

public class Service  extends HttpServlet {
	
	
	private Connection1 connection1;

	public Service()
	{
		connection1=new Connection1();
	}
	
	public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException
	{
		return connection1.getEmployee();
	}
	
	
	
	

}
