package first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {
	public static void main(String args[])
	{
		
	ApplicationContext asd= new ClassPathXmlApplicationContext("File.xml");
		
	EmployeeService1 empserv=(EmployeeService1)asd.getBean("employeeService1",EmployeeService1.class);
		
		
		empserv.addEmployee(null);

		empserv.getEmployee(1);
		empserv.getAllEmployee();
		empserv.setSalary(1, 20000);
		empserv.deleteSalary(1);
		
	}

}
