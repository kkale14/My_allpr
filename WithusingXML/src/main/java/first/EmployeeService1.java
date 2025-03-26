package first;

import java.util.List;


public class EmployeeService1 {
	
	private Interfaceemp interface1;
	private EmployeeDAO empl;
	
	public EmployeeService1()
	{
		
	}
	public EmployeeService1(Interfaceemp inter) {
		this.interface1=inter;
	}
	
	public void setEmployeeDAO(Interfaceemp interface1)
	{
		this.interface1=interface1;
	}
	
	
	public void addEmployee(Employee employee)
	{
		interface1.addEmployee(employee);
	}
	
	public  int getEmployee(int id)
	{
		return interface1.getEmployee(id);
		
	}
	
	public List<Employee> getAllEmployee()
	{
		return interface1.getAllEmployee();
		
	}
	
	public void setSalary(int id,int salary)
	{
		interface1.setSalary(id, salary);
	}
	
	
	public void deleteSalary(int id)
	{
		interface1.deleteSalary(id);
	}
	
	
}
