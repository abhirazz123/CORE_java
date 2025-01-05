package DEC_05;
class Account1{
	private String accountNumber ;
	private double balance ;
	
	public Account1(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public Account1 generateStatement() {
		System.out.println("Account Statement...");
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Account Balance : "+balance);
		
		return this;
		
	}
	 
		
	}
class SavingsAccount1 extends Account{
	
	private double interestRate ;
	public SavingsAccount1(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate ;
		
	}
	public Account generateStatement() {
		System.out.println("Account Statement...");
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Account Balance : "+getBalance());
		System.out.println("interestRate : "+interestRate+"%");
		return this;
		
		
	}
	public double SavingsAccount() {
		return interestRate;
		
	}
}
	class CheckingAccount1 extends  Account{
		private double overdraftLimit ;
		public CheckingAccount1(String accountNumber, double balance, double overdraftLimit) {
			super(accountNumber, balance);
			
			this.overdraftLimit = overdraftLimit;
		}
		public Account generateStatement() {
			System.out.println("Account Statement...");
			System.out.println("Account Number : "+getAccountNumber());
			System.out.println("Account Balance : "+getBalance());
			System.out.println("overdraftLimit" +overdraftLimit);
			return this;
		}
	
}

public class BankManagementSystem1 {
	public static void main(String[] args) {
		
		SavingsAccount1 savingsAccount = new SavingsAccount1("SA12345", 5000.0, 3.0);
        System.out.println("--- Generating Savings Account Statement ---");
        savingsAccount.generateStatement();
		
		
	}

}
