package DIC_05.instance_of;
import java.util.*;
class Bank
{
	public double  makePayment(double Amount) 
	{
		return Amount;

	}
}
class SBI extends Bank{
	@Override
	public double makePayment(double Amount)
	{
		System.out.println("Making a payment of " + Amount + " through SBI");
		return Amount;
	}
	public void offer() {
		System.out.println("SBI First time  Payment off RS-1000");
	}

}
class BOB extends Bank {
	@Override
	public double makePayment(double Amount) {
		System.out.println("Making a payment of " + Amount + " through BOB");
		return Amount;

	}
	public void offer() {
		System.out.println("BOB Banks offer First time payment by off RS: 1500");
	}
}
public class DynamicPolyInstanceOf2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("1.SBI BANK : ");
		System.out.println("2.BOB BANK : ");

		System.out.println("Enter the Choice: ");

		int choice = sc.nextInt();
		Bank bank = null;

		if(choice ==1) {
			bank = new SBI();
		}else if(choice == 2) {
			bank = new BOB();
		}else {
			System.out.println("Ivalid No : Plase Enter the Valid Digit.");
		}

		System.out.println("Enter the Amount: ");
		double Amount = sc.nextDouble();
		acceptpayament(bank, Amount);
	}
	public static void acceptpayament(Bank bank , double Amount) 
	{
		if(bank instanceof SBI) {
			SBI s = (SBI) bank;
			s.makePayment(Amount);
			s.offer();	
		}
		else if(bank instanceof BOB) {
			BOB B = (BOB) bank;
			B.makePayment(Amount);
			B.offer();
		}
	}

}
