package htpsrv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mylist")
public class Listitem extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		
		List<String> str=new ArrayList<>();
		
		
		
		str.add("Panipuri");
		str.add("Pavbhaji");
		str.add("CholePuri");
		str.add("Vadapav");
		str.add("Samosa");
		
		req.setAttribute("mylist", str);
		
		RequestDispatcher rsd= req.getRequestDispatcher("Actiontag.jsp");
		rsd.forward(req, res);
	}

}
