package process;

public class PaymentProcess {

	private CreditCard creditcard;
	private DebitCard debitcard;
		
		public void setCreditcard(CreditCard creditcard) {
			this.creditcard = creditcard;
		}

		
		public void setDebitcard(DebitCard debitcard) {
			this.debitcard = debitcard;
		}
		
		public void process()
		{
			System.out.println("Starting payment process");

			creditcard.process();
			debitcard.process();
			System.out.println("This is the main method");

		}

}
