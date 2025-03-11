//We created the code that one database connect to jdbc and fetch the two table of one database in output of one table 

package pacgmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
        String username = "system";   // Your Oracle username
        String password = "admin";
        
        
        Class.forName("oracle.jdbc.OracleDriver");

        // Establish the connection
        Connection connection = DriverManager.getConnection(url, username, password);
        
        Statement st,st2;
        st= connection.createStatement();
        st2=connection.createStatement();
        
        
        ResultSet rs,rs1;
        rs= st.executeQuery("select * from hotel");
         rs1= st2.executeQuery("select * from rssoftech");
        
        while(rs.next()&&rs1.next()) {
        	
        	String data = rs.getString("no")+" "+rs.getString("item")+" "+rs1.getString("fname")+" "+rs1.getString("batch_id");
        	
        	
        	System.out.println(data);
        }
        
//        if (connection != null) {
//            System.out.println("Connection established successfully to Oracle!");
//         }

         // Close the connection when done
         connection.close();

        
	}
	}


