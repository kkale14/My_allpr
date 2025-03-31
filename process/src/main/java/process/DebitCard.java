package process;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class DebitCard   implements CardPayment{

	
	 public DebitCard()
	{
		
	}
	@Override
	public void process() {
		System.out.println("Welcome to DebitCard Method");
	}

}
