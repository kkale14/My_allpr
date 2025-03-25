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
		 
		 es.addEmployee(null);
		 es.updateSalary(1, 3000);

	}
}








//employeeService.addEmployee(new Employee(1, "Kalyani", "Computer Eng", 50000));
//employeeService.addEmployee(new Employee(2, "Nutan", "HR", 60000));
//
//
//employeeService.getEmployee(1);
//
//List<Employee> allEmployees = employeeService.getAllEmployees();
//
//employeeService.updateSalary(1, 55000);
//
//employeeService.deleteEmployee(2);
//
//employeeService.getAllEmployees();
//}








