package OCt_25.variable_copy_demo;

public class Customer {

	private double balance  = 1000; //data handing
	
	public void deposit(double amount) {
		if(amount<0) {
			System.out.println("Amount con't deposite");
		}else {
			this.balance = this.balance+amount;
			System.out.println("After deposite: " + this.balance);
		}
	}
	public void withdraw(double amount) {
		this.balance = this.balance-amount;
		System.out.println("After withdraw: " + this.balance);
	}
}
