package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImp  implements IEmployeeDAO{

	 JdbcTemplate temp;
	 
    private List<Employee> employeeList = new ArrayList<>();

	@Autowired
    public EmployeeDAOImp(JdbcTemplate template1)
    {
    	this.temp=template1;
    }
    
	@Override
	public void addEmployee(Employee employee) {
		
        System.out.println("Employee added:");
        temp.update("insert into employee1 values(?,?,?,?)",employee.getId(),employee.getFname(),employee.getDepartment(),employee.getSalary());
}

		
	

	@Override
	public int getEmployee(int id)  {
		
		temp.update("select * from employee1 where id=?",id);
		System.out.println("Employee Get Method");
		return id;
		

       
	}

	@Override
	public List<Employee> getAllEmployees() {
		temp.update("select * from employee1");
        System.out.println("All Employees:");
		return employeeList;
	}

	
	public void updateSalary(int id, int salary) {
		
	//	temp.update("update employee1 set salary=? where id=?",id,salary);
        System.out.println("Salary update method ");
       
	}

	@Override
	public void deleteEmployee(int id) {
		
		//temp.update("");
		System.out.println("Delete employee method");
		
	}
}


