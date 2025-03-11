//We insert the new values in the table using scanner class

package pacgmain;

import java.sql.*;
import java.util.Scanner;

public class Query {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Define the connection details
        String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
        String username = "system";   // Your Oracle username
        String password = "admin";   // Your Oracle password

        
        String insrtquery = "INSERT INTO hotel (no, cust_name, item, quantity, price) VALUES (?, ?, ?, ?, ?)";
        
        
        Class.forName("oracle.jdbc.OracleDriver");

        // Establish the connection
        Connection connection = DriverManager.getConnection(url, username, password);
        
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery("select * from hotel");
        
        System.out.println("+------+---------+--------+-------------+---------+");
        System.out.println("| No   |   Name  |  Item  |   quantity  |  Price  |");
        System.out.println("+------+---------+--------+-------------+---------+");
        
        
        while(rs.next()) {
        	
        	String data = rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);        	
        	
        	String no=rs.getString(1);
        	String name=rs.getString(2);
        	String item=rs.getString(3);
        	String Quantity=rs.getString(4);
        	String Price=rs.getString(5);
        	
        	System.out.printf("|%-6s|%-9s|%-8s|%-13s|%-9s|\n ",no,name,item,Quantity,Price);
        	
        }
        System.out.println("+------+---------+--------+-------------+---------+");
        
        System.out.println("\nenter new values");
        
        Scanner s = new Scanner(System.in);
        
        String v1=s.next();
        String v2=s.next();
        String v3=s.next();
        String v4=s.next();
        String v5=s.next();
        
        PreparedStatement ps = connection.prepareStatement(insrtquery);
        
        
        
        ps.setString(1, v1);
        ps.setString(2, v2);
        ps.setString(3, v3);
        ps.setString(4, v4);
        ps.setString(5, v5);
        //ps.setString(6, "19-jan-25");
        
        int rtrnrws = ps.executeUpdate();
        
        System.out.println("\n");
        
        System.out.println(rtrnrws+" rows returned");
        
        rs=ps.executeQuery("select * from hotel");
        
        
        
        while(rs.next()) {
        	

        	String data = rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
        	
        	System.out.println(data);
        }
        
        
    }
}
