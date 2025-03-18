package pqrs;

public class Creditcard implements Cardpayment {

	public Creditcard()
	{
		System.out.println("Credit card Section");
	}

	@Override
	public void pay() {
		System.out.println("this is pay method");
		
	}
	
}
