package pacgmain;

import java.sql.*;

public class demo {

	public static void main(String[] args) {

		       
		        String url = "jdbc:oracle:thin:@localhost:1521:xe";  
		        String username = "system";   
		        String password = "admin";  
		

		        String insertSQL = "INSERT INTO employee (fname, lname) VALUES (?, ?)";

		        try
		        {
		        	Class.forName("oracle.jdbc.OracleDriver");
		        	
		        	Connection connection = DriverManager.getConnection(url,username,password);

		        }
		        catch(Exception e)
		        {
		        	
		        }
		       
		    
		       
	}

}
