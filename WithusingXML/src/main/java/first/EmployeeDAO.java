package first;

import java.util.List;


public class EmployeeDAO implements Interfaceemp{

	public EmployeeDAO()
	{
		
	}
	@Override
	public void addEmployee(Employee employee) {
		System.out.println("Welcome to ADD method");		
	}

	@Override
	public int getEmployee(int id) {
		System.out.println("Welcome to GET method");
		return id;
				
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		System.out.println("Welcome to ALL Employee method");		
		return null;
	}

	@Override
	public void setSalary(int id, int salary) {
		System.out.println("Welcome to Salary method");		
		
	}

	@Override
	public void deleteSalary(int id) {
		System.out.println("Welcome to Delete method");		
		
	}

}
