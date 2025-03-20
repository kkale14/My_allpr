package pqrs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.micrometer.observation.Observation.Context;

public class File {

	public static void main(String[] arg)
	{
		
		ApplicationContext a = new ClassPathXmlApplicationContext("Springconnfig.xml");
		
		Creditcard c = (Creditcard)a.getBean("bean");
		
		
//		Debitcard d = (Debitcard)a.getBean("serv");
		
		c.pay();
		
		c.setA(2);
		System.out.println(c.getA());
		 
		Creditcard c1 = (Creditcard)a.getBean("bean");
		
		//c1.setA(5);
		c1.getA();
		System.out.println(c1.getA());
		
		Address ad=(Address)a.getBean("sos");
		
		ad.setCity("Pune");
		System.out.println(ad.getCity());
		ad.setPin(1234);
		System.out.println(ad.getPin());
		ad.setState("Mahara");
		System.out.println(ad.getState());
	
		
	//	c.getAddress(); 
		//create class processor in that make interface 
		
		
	}

	
	
}
