package process;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
public class CreditCard implements CardPayment{

	CreditCard()
	{
		
	}
	@Override
	public void process() {
		System.out.println("Welcome to CreditCard Method");
		
	}

}
