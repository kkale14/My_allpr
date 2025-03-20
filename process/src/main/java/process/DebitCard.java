package process;

public class DebitCard implements CardPayment{

	@Override
	public void process() {
		System.out.println("Welcome to DebitCard Method");
	}

}
