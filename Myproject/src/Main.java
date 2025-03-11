import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
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

            if (connection != null) {
                System.out.println("Connection established successfully to Oracle!");
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
