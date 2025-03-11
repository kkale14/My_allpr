package pacgmain;

import java.sql.Connection;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Updateque {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		 String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
	     String username = "system";   // Your Oracle username
	     String password = "admin";  
	     
	     Class.forName("oracle.jdbc.OracleDriver");

	        // Establish the connection
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
	        PreparedStatement pst=connection.prepareStatement("update ");
	        
	}

}
