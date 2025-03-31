package process;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProcessMain {

		public static void main(String[] args)
		{
		//	ApplicationContext a1=new ClassPathXmlApplicationContext("spring.xml");
	
			ApplicationContext a2=new AnnotationConfigApplicationContext(ConfigFile.class);

		// 	CreditCard c=(CreditCard)a1.getBean("new");
		PaymentProcess payment=(PaymentProcess)a2.getBean("paymentProcess");
	//DebitCard payment1=(DebitCard)a2.getBean("debitCard");

			
	//	payment.process();
		payment.process();			
		}
}
