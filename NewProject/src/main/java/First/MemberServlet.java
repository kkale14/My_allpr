package First;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import First.Service;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberServlet  extends HttpServlet{
	
	private Dao de;
	private Service ser;

	public void init() {
		de = new Dao();
	}
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
			String data = req.getParameter("data");
		
		if("register".equals(data)) {
			register1(req,res);
		}
		else if("fetch".equals(data))
		{
			try {
				List<Service> students = de.getAllStudents();
				res.sendRedirect("data.html");
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		 }
		 else
		 {
			 res.sendRedirect("error.html");

		 }
		
		
		
	}
	private void register1(HttpServletRequest request, HttpServletResponse response)
            throws  IOException {

        int registerUserId = 0;
        
  
        String name = request.getParameter("name");
        String item = request.getParameter("item");
       // String phone = request.getParameter("phone");
        String product = request.getParameter("product");
      
        Service se1 = new Service();
        
        se1.setName(name);
        se1.setItem(item);
        
        se1.setProduct(product);
      

        try {
            registerUserId = de.register(se1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (registerUserId > 0) {
        	
            request.setAttribute("name", se1.getName());
            request.setAttribute("email", se1.getItem());
         //   request.setAttribute("phone", andst.getPhone());
            request.setAttribute("username", se1.getProduct());
          
    }
        else {
        	response.sendRedirect("data.html");
        }
	}
	

}
