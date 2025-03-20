package process;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcessMain {

		public static void main(String[] args)
		{
			ApplicationContext a1=new ClassPathXmlApplicationContext("spring.xml");
	
		// 	CreditCard c=(CreditCard)a1.getBean("new");
		PaymentProcess payment=(PaymentProcess)a1.getBean("payment");
			
		payment.process();
			
		}
}
