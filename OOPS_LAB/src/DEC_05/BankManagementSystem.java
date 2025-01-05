package DEC_05;
class Account {
	private String accountNumber ;
	private double balance ;
	
	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public Account generateStatement() {
		System.out.println("Account Statement:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        return  this;
		
	}
	
}
class SavingsAccount extends  Account{

	private double interestRate ;
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
		
	}
	public double getInterestRate() {
        return interestRate;
    }
	public SavingsAccount generateStatement() {
        System.out.println("Savings Account Statement:");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
        return this;
    }
}
	class CheckingAccount extends Account{
		private double overdraftLimit ;
		
		public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
			super(accountNumber, balance);
			this.overdraftLimit = overdraftLimit ;
			
		}
		public double getoverdraftLimit(){
			return overdraftLimit;
			
		}
		public Account generateStatement() {
			System.out.println("checking Account Statement");
			System.out.println("Account Number"+getAccountNumber());
			System.out.println("Account Balance : "+getBalance());
			System.out.println("Overdraft : "+ overdraftLimit);
				
			return this;
			
		}
	}
 
	


public class BankManagementSystem {
	public static void main(String[] args) {
		 
		      
		        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 3.5);
		        System.out.println("--- Generating Savings Account Statement ---");
		        savingsAccount.generateStatement();
	}

}
