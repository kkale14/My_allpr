package Mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCon {

	public static void main(String[] args) {
		
		 String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
	     String username = "system";   // Your Oracle username
	     String password = "admin";   // Your Oracle password

	     try {
	            
	            Class.forName("oracle.jdbc.OracleDriver");

	            
	            Connection connection = DriverManager.getConnection(url, username, password);
	            
	            PreparedStatement ps= connection.prepareStatement("insert into stdregister (std_id,std_name,std_username,password,email,phone_no) values (?,?,?,?,?,?)");
	            
	            
	            if (connection != null) {
	                // System.out.println("Connection established successfully to Oracle!");
	             }

	             // Close the connection when done
	             connection.close();

	     }
	     catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection failed!");
	            e.printStackTrace();
	        }
}
}
