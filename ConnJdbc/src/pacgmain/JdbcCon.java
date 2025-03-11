//We fetch the values from table 

package pacgmain;

import java.sql.*;

public class JdbcCon {
    public static void main(String[] args) {
    	
    	
    	
    	
        // Define the connection details
        String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
        String username = "system";   // Your Oracle username
        String password = "admin";   // Your Oracle password

        try {
            // Load and register the Oracle JDBC driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            
            Statement st = connection.createStatement();
            
            ResultSet rs = st.executeQuery("select * from employee");
            
            while(rs.next()) {
            	
            	String data = rs.getString("emp_id")+" "+rs.getString("fname")+" "+rs.getString("lname")+" "+rs.getString("salary");
            	
            	
            	System.out.println(data);
            }
            
           

            if (connection != null) {
               // System.out.println("Connection established successfully to Oracle!");
            }

            // Close the connection when done
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
