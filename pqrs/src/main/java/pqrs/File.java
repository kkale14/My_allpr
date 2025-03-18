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
		
		
		
		
	}

	
	
}
