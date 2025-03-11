package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Dao {
		

	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
	private static final   String username = "system";   // Your Oracle username
	private static final    String password = "admin";   // Your Oracle password
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		return DriverManager.getConnection(url,username,password);
		
		
	}
	public int register(Service ser)
	{
		
		String str="insert into item (id,name,item,product) values(seq.NEXTVAL,?,?,?)";
	int result=0;
		
		try(Connection connection=getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("str"))
		{
			
			preparedStatement.setString(1,ser.getName());
			preparedStatement.setString(2,ser.getItem());
			preparedStatement.setString(3,ser.getProduct());
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public List<Service> getAllStudents() throws ClassNotFoundException, SQLException {
    	
    	
    	
        List<Service> students = new ArrayList<>();
        String FETCH_STUDENTS_SQL = "SELECT id, name,item, product FROM item ";

        Connection connection = getConnection();
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(FETCH_STUDENTS_SQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
            	Service serv = new Service();
            	serv.setName(rs.getString("name"));
            	serv.setItem(rs.getString("item"));
            	serv.setProduct(rs.getString("product"));
           
                
                students.add(serv);
            }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return students;
    }
	     
	
	
}
