package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImp  implements IEmployeeDAO{


    private List<Employee> employeeList = new ArrayList<>();

	
	@Override
	public void addEmployee(Employee employee) {
		
		//employeeList.add(employee);
        System.out.println("Employee added:");

}

		
	

	@Override
	public int getEmployee(int id)  {
		System.out.println("Employee Get Method");
		return id;
		

       
	}

	@Override
	public List<Employee> getAllEmployees() {
        System.out.println("All Employees:");
		return employeeList;
	}

	
	public void updateSalary(int id, int salary) {
		
        System.out.println("Salary update method ");

       
	}

	@Override
	public void deleteEmployee(int id) {
		System.out.println("Delete employee method");
		
	}
}


