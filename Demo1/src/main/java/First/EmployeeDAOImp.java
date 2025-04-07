package First;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public int getEmployee(int id)  {
		
//		temp.update("select * from employee1 where id=?",id);
//		System.out.println("Employee Get Method");
//		return id;
		String str1="Select * from emploeyee1 where id=?";
		MapSqlParameterSource parameter1=new MapSqlParameterSource();
		
		parameter1.addValue("id", id);
		return jdbcTemplate.queryForObject(str1, parameter1, new BeanPropertyRowMapper<>(Employee.class));


       
	}

	@Override
	public List<Employee> getAllEmployees() {
		
        
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


