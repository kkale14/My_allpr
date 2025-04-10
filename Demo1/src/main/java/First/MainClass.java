package First;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String args[])
	{
		
		//  IEmployeeDAO employeeDAO = new EmployeeDAOImp();

		 ApplicationContext ap=new AnnotationConfigApplicationContext(Config.class);
		 
		 EmployeeService es=(EmployeeService) ap.getBean(EmployeeService.class);
		 
		 Employee employee=new Employee();
		 es.addEmployee(employee);
		 
		 System.out.println(" Get  Employee : "+ es.getEmployee(3));
		 System.out.println(" Get All Employee : "+ es.getAllEmployees());
}
}