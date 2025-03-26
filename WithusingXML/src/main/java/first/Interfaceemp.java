package first;

import java.util.List;


public interface Interfaceemp {
	
	void addEmployee(Employee employee);
	int getEmployee(int id);
	List<Employee> getAllEmployee();
	void setSalary(int id,int salary);
	void deleteSalary(int id);

}
