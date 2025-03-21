package first;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class Srvlt extends HttpServlet {
	
	private Loginandregdao loginandregdao;
	
	public void init() {
		loginandregdao = new Loginandregdao();
	}
	
	protected void  service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String activity = request.getParameter("activity");
		
		if("register".equals(activity)) {
			registerUser(request,response);
		}else if("login".equals(activity)) {
			loginUser(request,response);
		} else {
			response.sendRedirect("regerror.html");
		}
		
	}
	
	private void registerUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int registerUserId = 0;
        
  
        String name = request.getParameter("name");
        String email = request.getParameter("email");
       // String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String role = request.getParameter("role").toUpperCase(); // Get role (ADMIN/STUDENT)

        Adminandstdmodel andst = new Adminandstdmodel();
        
        andst.setName(name);
        andst.setEmail(email);
        
        andst.setUsername(username);
        andst.setPassword(password);
        andst.setRole(role); // Assign the role

        try {
            registerUserId = loginandregdao.userRegister(andst);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (registerUserId > 0) {
        	
            request.setAttribute("name", andst.getName());
            request.setAttribute("email", andst.getEmail());
         //   request.setAttribute("phone", andst.getPhone());
            request.setAttribute("username", andst.getUsername());
            request.setAttribute("password", andst.getPassword());
            request.setAttribute("role", andst.getRole());

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Logintab.html");
            requestDispatcher.forward(request, response);
        } else {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("regerror.html");
            requestDispatcher.forward(request, response);
        }
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            String role = loginandregdao.userValidate(username, password);

            if (role != null) {
            	
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                session.setAttribute("role", role);

                if ("ADMIN".equals(role)) {
                	List<Adminandstdmodel> students = loginandregdao.getAllStudents();
                    request.setAttribute("students", students);
                    request.getRequestDispatcher("emp.jsp").forward(request, response);
                   
                } else if("STUDENT".equals(role)) {
                    response.sendRedirect("welcome.html");
                }
            } else {
                response.sendRedirect("error.html");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
