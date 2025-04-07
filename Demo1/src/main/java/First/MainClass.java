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
		 
		 Employee employee=new Employee(3,"Jenny","CSS",40000);
		 es.addEmployee(employee);
		 
		 System.out.println(" Get  Employee : "+ es.getEmployee(3));
		 System.out.println(" Get All Employee : "+ es.getAllEmployees());

//		 employee.setId(1);
//		 employee.setFname("Nutan");
//		 employee.setDepartment("CS");
//		 employee.setSalary(20000);
//		 
//		 es.getEmployee(1);
//		 es.getAllEmployees();
//		 es.addEmployee(employee);
//		 es.updateSalary(1, 3000);
//		 es.getEmployee(1);
		 
//		 es.addEmployee(employee);
//		 es.deleteEmployee(1);
//		 es.updateSalary(0, 0);
//		 es.getAllEmployees();
//		 es.getEmployee(1);
	}
}















