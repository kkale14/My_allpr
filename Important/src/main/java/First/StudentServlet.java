package First;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class StudentServlet extends HttpServlet {

    private StudentDAO studentDAO;

    @Override
    public void init() throws ServletException {
        studentDAO = new StudentDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");
        String grade = request.getParameter("grade");

        boolean isRegistered = studentDAO.registerStudent(name, email, course, grade);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (isRegistered) {
            out.println("<html><body><h1>Registration Successful!</h1></body></html>");
        } else {
            out.println("<html><body><h1>Registration Failed. Please try again.</h1></body></html>");
        }
    }
}
