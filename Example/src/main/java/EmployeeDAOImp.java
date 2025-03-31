//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class EmployeeDAOImp  implements IEmployeeDAO{
//
//	
////	 String url = "jdbc:oracle:thin:@localhost:1521:xe";  
////     String username = "system";   
////   String password = "admin";   
////     
////     private Connection connection;
////
////     public EmployeeDAOImp() {
////         try {
////             connection = DriverManager.getConnection(url,username,password);
////             System.out.println("Database connected successfully!");
////         } catch (SQLException e) {
////             e.printStackTrace();
////         }
////     }
////	
//    private List<Employee> employeeList = new ArrayList<>();
//
//	
//	@Override
//	public void addEmployee(Employee employee) {
//		
//		//employeeList.add(employee);
//        System.out.println("Employee added:");
//		
//		
////		
//// String query="INSERT INTO employee1 VALUES (id, Fname, department, salary) VALUES (?, ?, ?, ?)";
////	 
//// try (PreparedStatement ps = connection.prepareStatement(query)) {
////     ps.setInt(1, employee.getId());
////     ps.setString(2, employee.getFname());
////     ps.setString(3, employee.getDepartment());
////     ps.setDouble(4, employee.getSalary());
////     ps.executeUpdate();
////     System.out.println("Employee added: " + employee);
//// } catch (SQLException e) {
////     e.printStackTrace();
//// }
//		
//		
//}
//
//		
//	
//
//	@Override
//	public int getEmployee(int id)  {
//		System.out.println("Employee Get Method");
//		return id;
//		
////		String query1= "Select * from Employee1 where id=?";
////		
////		try(Connection connection = DriverManager.getConnection(url, username, password);
////				PreparedStatement ps = connection.prepareStatement(query1))
////		{
////			
////			ps.setInt(1, id);
////	        ResultSet rs = ps.executeQuery();
////	        
////	        while(rs.next()) {
////	        	
////	        	
////	        	int id1=rs.getInt(1);
////	        	String Fname=rs.getString(2);
////	        	String department=rs.getString(3);
////	        	int salary=rs.getInt(4);
////	        	
////		}
////		}
//				
//       
//	}
//
//	@Override
//	public List<Employee> getAllEmployees() {
//        System.out.println("All Employees:");
//		return employeeList;
//	}
//
//	
//	public void updateSalary(int id, int salary) {
//		
//        System.out.println("Salary update method ");
//
//       
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		System.out.println("Delete employee method");
//		
//	}
//}
//
//
