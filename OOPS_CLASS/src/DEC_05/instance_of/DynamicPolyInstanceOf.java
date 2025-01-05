package DEC_05.instance_of;
import java.util.*;

class Payment {

	public double makePayment(double Amount) {
		return Amount;

	}


}
class UPI extends Payment {
	@Override
	public double makePayment(double Amount) {
		System.out.println("Making a payamnet: "+ Amount + " through UPI" );
		return Amount;


	}
	public void offer() {
		System.out.println("Make first payment and get 100 RS");
	}

}
class CreditCard extends Payment{
	@Override
	public double makePayment(double Amount) {
		System.out.println("Making a payment: "+ Amount + " Credit Card ");
		return Amount;

	}
	public void offer() {
		System.out.println("Make firs time payment and get a hollday ticket");
	}
}


public class DynamicPolyInstanceOf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		System.out.println("Enter your choice");

		System.out.println("1. UPI Payment");
		System.out.println("2. Credit Card Payment");

		int choice = sc.nextInt();

		System.out.println("Enter the Amount: ");
		double Amount = sc.nextDouble();

		Payment payment = null;

		if (choice == 1) {
			payment = new UPI();

		}
		else if (choice == 2  ) {
			payment = new CreditCard();
		}else {
			System.out.println("InValid Choice! Exiting...");
		}
		acceptPayment(payment, Amount);
	}
		public static void acceptPayment(Payment payment, double Amount ) {
			if ( payment instanceof UPI) {
				
				UPI U =  (UPI) payment;
				U.makePayment(Amount);
				U.offer();
			}
			if(payment instanceof CreditCard) 
			{
				CreditCard C = (CreditCard) payment;
				C.makePayment(Amount);
				C.offer();
			}
		
	}

}
