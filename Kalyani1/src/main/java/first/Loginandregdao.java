package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Loginandregdao {
	
	
	
		
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";  // Change with your Oracle DB details
	private static final   String username = "system";   // Your Oracle username
	private static final    String password = "admin";   // Your Oracle password
	
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		
		
		return DriverManager.getConnection(url,username,password);
		
		
	}
	
	public int userRegister(Adminandstdmodel adminstdmdl) throws SQLException, ClassNotFoundException {
		
		String insrt_qry="insert into mdata1 (id,name,username,password,email,role) values (SEQ.NEXTVAL,? ,? , ?, ?,?)";
		
		int affect=0;
		
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(insrt_qry)){
			
			//preparedStatement.setString("name");
			preparedStatement.setString(1, adminstdmdl.getName());
			preparedStatement.setString(2, adminstdmdl.getUsername());
			preparedStatement.setString(3, adminstdmdl.getPassword());
			preparedStatement.setString(4, adminstdmdl.getEmail());
			preparedStatement.setString(5, adminstdmdl.getRole());
			
			affect=preparedStatement.executeUpdate();
			
			
		} catch(SQLException e){
			
			e.printStackTrace();
			
		}
		
		
		return affect;
		
		
	}
	
	public String userValidate(String username, String password) throws ClassNotFoundException, SQLException {
		
		String role = null;
		
		String login_qry="select role from mdata1 where username = ? and password = ?";
		
		try(Connection connection=getConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(login_qry)){
			
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next()) {
				role = rs.getString("role");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return role;
	}
	
	public List<Adminandstdmodel> getAllStudents() throws ClassNotFoundException, SQLException {
    	
    	
    	
        List<Adminandstdmodel> students = new ArrayList<>();
        String FETCH_STUDENTS_SQL = "SELECT id, name, username,email,role FROM mdata1 WHERE role = 'STUDENT'";

        Connection connection = getConnection();
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(FETCH_STUDENTS_SQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
            	Adminandstdmodel student = new Adminandstdmodel();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setEmail(rs.getString("username"));
                student.setUsername(rs.getString("email"));
                student.setRole(rs.getString("role"));
                students.add(student);
            }
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return students;
    }
	     
	     


}
