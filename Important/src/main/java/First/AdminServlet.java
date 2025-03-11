package First;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AdminServlet extends HttpServlet {

    private StudentDAO studentDAO;

    @Override
    public void init() throws ServletException {
        studentDAO = new StudentDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (studentDAO.validateAdmin(username, password)) {
            // Show Admin Dashboard with Students List
            showAdminDashboard(response);
        } else {
            response.sendRedirect("admin_login.html");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showAdminDashboard(response);
    }

    private void showAdminDashboard(HttpServletResponse response) throws IOException {
        ResultSet students = studentDAO.getStudents();
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Admin Dashboard</title></head><body>");
        out.println("<h1>Admin Dashboard</h1>");
        out.println("<h2>Students List</h2>");
        out.println("<table border='1'>");
        out.println("<thead><tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Grade</th></tr></thead>");
        out.println("<tbody>");

        try {
            while (students.next()) {
                out.println("<tr>");
                out.println("<td>" + students.getInt("id") + "</td>");
                out.println("<td>" + students.getString("name") + "</td>");
                out.println("<td>" + students.getString("email") + "</td>");
                out.println("<td>" + students.getString("course") + "</td>");
                out.println("<td>" + students.getString("grade") + "</td>");
                out.println("</tr>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println("</tbody></table>");
        out.println("</body></html>");
    }
}
