package First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String args[])
	{
		ApplicationContext asd=new AnnotationConfigApplicationContext(ConfigFile.class);
		

		EmpService es=(EmpService)asd.getBean(EmpService.class);
		es.addEmp(null);
		es.getEmp(1);
		es.getAllEmployee();
		es.deleteEmp(1);
		es.updateEmp(1,30000);
	}
}
