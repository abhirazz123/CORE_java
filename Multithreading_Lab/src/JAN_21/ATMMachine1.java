package JAN_21;

class Account1{
	private int balance =0;
	public synchronized void withdraw(int amount) {
		while(balance <amount) {
			System.out.println(Thread.currentThread().getName()+" is waiting for sufficient balance to withdraw " + amount );
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		balance = balance - amount;
		
		System.out.println(Thread.currentThread().getName()+" withdraw " +amount +" updated balance "+balance);
		 
	}
	public synchronized void deposit(int amount) {
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName()+" deposit " +amount + " updated balance " + balance );
		notify();
	}
	
}

class Drawer1 extends Thread{
	private Account account;
	
	public Drawer1(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		int[] withdrawals = {100 , 200 , 300};
		
		for (int amount : withdrawals) {
	          account.withdraw(amount);
	          try {
	        	  sleep(1000);
	          }catch(InterruptedException e) {
	        	  e.printStackTrace();
	          }   
	   }
  }
}
class Depositor1 extends Thread{
	private Account account;
	public Depositor1(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		int []deposits = {500,400,300};
		for(int amount : deposits) {
			account.deposit(amount);
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class ATMMachine1 {

	public static void main(String[] args) {
		Account account = new Account();

        
	       Depositor depositor = new Depositor(account);
	       depositor.setName("Depositor");
	       depositor.start();
	      
	       
	       Drawer drawer = new Drawer(account);
	       drawer.setName("Drawer");
	       drawer.start();

	}

}
