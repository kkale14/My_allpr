package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOImp  implements IEmployeeDAO{

	 JdbcTemplate temp;
	 
    private List<Employee> employeeList = new ArrayList<>();

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
//    public EmployeeDAOImp(JdbcTemplate template1)
//    {
//    	this.temp=template1;
//    }
    
	@Override
	public void addEmployee(Employee employee) {
		
//        System.out.println("Employee added:");
//        temp.update("insert into employee1 values(?,?,?,?)",employee.getId(),employee.getFname(),employee.getDepartment(),employee.getSalary());

	String str="Insert intp employee1(id,fname,department,salary)values(:id,  :fname,  :department, :salary)";
	
	MapSqlParameterSource parameter=new MapSqlParameterSource();
	parameter.addValue("id", employee.getId());
	parameter.addValue("Fname", employee.getFname());
	parameter.addValue("department", employee.getDepartment());
	parameter.addValue("salary", employee.getSalary());
	
	jdbcTemplate.update(str,parameter);

}
	
	
	@Override
	public Employee getEmployee(int id) {
	    // SQL query
	    String str = "SELECT * FROM employee1 WHERE id = :id";

	    // Setting up the parameters
	    MapSqlParameterSource parameter = new MapSqlParameterSource();
	    parameter.addValue("id", id);  // Ensure that the parameter key matches the placeholder in SQL

	    try {
	        // Execute the query and map the result to the Employee object
	        return jdbcTemplate.queryForObject(str, parameter, new BeanPropertyRowMapper<>(Employee.class));
	    } catch (EmptyResultDataAccessException e) {
	        // Handle case where no employee is found for the given ID
	        System.out.println("No employee found with id: " + id);
	        return null;  // Or you can throw a custom exception
	    } catch (IncorrectResultSizeDataAccessException e) {
	        // Handle case where more than one result is found (which should not happen if id is unique)
	        System.out.println("Multiple employees found with id: " + id);
	        return null;  // Or you can throw a custom exception
	    }
	}

	
	
	
	@Override
	public List<Employee> getAllEmployees() {
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


