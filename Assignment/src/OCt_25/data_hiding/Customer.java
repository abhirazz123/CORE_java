package OCt_25.data_hiding;

public class Customer {
	private double balance = 1000; // data Hiding
	
	public void Deposit(double amount) {
		if(amount<0) {
			System.out.println("Anount can't deposited");
		}else {
			this.balance = this.balance+amount;
			System.out.println("After deposite:"+this.balance);
		}
	}
	public void withdraw(double amount) {
		this.balance = this.balance-amount;
		   System.out.println("After Withdraw :"+this.balance);
	}

}
