package htpsrv;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class Connection1 {

	
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
	private static final   String username = "system";   // Your Oracle username
	private static final    String password = "admin";   // Your Oracle password
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection(url,username,password);
		
		
	}
	
	
	public List<Employee> getEmployee() throws ClassNotFoundException, SQLException {
    	
    	
    	
		ArrayList <Employee> empl = new ArrayList<>();
        String FETCH_EMPLOYEE_SQL = "SELECT deptid,fname,lname,salary from empl";

        Connection connection = getConnection();
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(FETCH_EMPLOYEE_SQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
            	
            	Employee emp = new Employee();
            	
            	emp.setDeptid(rs.getInt("deptid"));
            	emp.setFname(rs.getString("fname"));
            	emp.setLname(rs.getString("lname"));
            	emp.setSalary(rs.getInt("salary"));
            	empl.add(emp);
            }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return empl;
    }
	}


