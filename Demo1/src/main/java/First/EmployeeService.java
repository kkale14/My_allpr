package First;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
public class EmployeeService {

	
	private IEmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeService(IEmployeeDAO employeeDAOs) {
		
		this.employeeDAO=employeeDAOs;
		
	}

	public  void addEmployee(Employee employee)
	{
        employeeDAO.addEmployee(employee);

		
	}
	
	public Employee getEmployee(int id)
	{
		return employeeDAO.getEmployee(id);
		
        
	}
	
	public List<Employee> getAllEmployees()
	{
        return employeeDAO.getAllEmployees();
		
	}
	
	public  void updateSalary(int id,int salary)
	{
		
        employeeDAO.updateSalary(id, salary);

	}
	
	public void  deleteEmployee(int id)
	{
		
        employeeDAO.deleteEmployee(id);

	}
}
