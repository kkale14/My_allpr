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
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	//	Address add=new Address();
	
	public void getAddress()
	{
		System.out.println(add.toString());
	}

	
	
}
