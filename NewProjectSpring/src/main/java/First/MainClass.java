package First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String args[])
	{
		
		//  IEmployeeDAO employeeDAO = new EmployeeDAOImp();

		 ApplicationContext ap=new AnnotationConfigApplicationContext(Config.class);
		 
		 EmployeeService es=(EmployeeService) ap.getBean("employeeService");
		 
		 Employee employee=new Employee();
		 employee.setId(1);
		 employee.setFname("Nutan");
		 employee.setDepartment("CS");
		 employee.setSalary(20000);
		 
		 es.getEmployee(1);
		 es.getAllEmployees();
		 es.addEmployee(employee);
		 es.updateSalary(1, 3000);
		 es.getEmployee(1);

	}
}















