package process;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class PaymentProcess {

	private CardPayment cardpayment;
	private CardPayment debitcard;

	
	

	PaymentProcess( ){
	System.out.println("Hello");
		
	}
	@Autowired
	PaymentProcess(@Qualifier("debitCard") CardPayment paycard ){
		this.cardpayment=paycard;
		
	}
	
	
		
	/*	public void setCreditcard(CardPayment creditcard) {
			this.creditcard = creditcard;
		}
		

		
		public void setDebitcard(CardPayment debitcard) {
			this.cardpayment = debitcard;
		}
		*/
		public void process()
		{
			System.out.println("Starting payment process");

			cardpayment.process();
			//debitcard.process();
			System.out.println("This is the main method");

		}

}
