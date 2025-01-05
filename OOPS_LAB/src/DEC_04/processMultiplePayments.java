package DEC_04;

class Payment
{


	public void processPayment() 
	{
		System.out.println("Processing payment ");

	}
}
class CreditCardPayment extends Payment
{

	@Override
	public void processPayment() 
	{
		System.out.println("Processing credit card payment  ");

	}

}
class PayPalPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing PayPal payment  ");

	}
}

class BankTransferPayment extends Payment{
	@Override
	public void processPayment() {
		System.out.println("Processing bank transfer payment ");

	}
}



public class processMultiplePayments 
{

	public static void main(String[] args)
	{
		System.out.printf("Generic Payment : ");
		Payment genericPayment = new Payment();
		genericPayment.processPayment();

		System.out.println("\nCredit Card Payment:");
		Payment creditCardPayment = new CreditCardPayment();
		creditCardPayment.processPayment();

		System.out.println("\nPayPal Payment:");
		Payment payPalPayment = new PayPalPayment();
		payPalPayment.processPayment();


		System.out.println("\nBank Transfer Payment:");
		Payment bankTransferPayment = new BankTransferPayment();
		bankTransferPayment.processPayment();



		System.out.println("\nProcessing multiple payments:");
		processMultiplePayments(genericPayment, creditCardPayment, payPalPayment, bankTransferPayment);
	}
	public static void processMultiplePayments( Payment... payments) 
	{
		for (Payment p : payments) {
			p.processPayment();
		}

	}

}
