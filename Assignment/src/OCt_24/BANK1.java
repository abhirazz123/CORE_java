package OCt_24;

public class BANK1 {
	private String  bankName;
	private String  bankCustomerName;
	private String  bankAddress;
	private String  bankIFSCCode;
	private int  customerAccountNumber;
	private int  currentBalance;
	

	public void setkDeatils(String  bankName, String bankAddress, String bankIFSCCode, String bankCustomerName, int customerAccountNumber, int currentBalance) {
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		this.bankCustomerName=bankCustomerName;
		this.customerAccountNumber =customerAccountNumber;
		this.currentBalance =currentBalance;
		System.out.println("current Balance = "+currentBalance);
	}public void deposit (int amount) {
		if (amount >=0) {
			currentBalance +=amount;
			System.out.println("Deposit:" + amount + " Available Balance: "+ currentBalance);
		}else {
			System.out.println("Invalid deposit amount");
		}
		
	}
	public void withdraw(int amount ) {
		if(amount>0 && amount<=currentBalance) {
			currentBalance =currentBalance-amount;
			System.out.println(" Withdraw: "+amount+"Available Balance: "+currentBalance);
		}else if(amount>currentBalance) {
			System.out.println("Insufficient balance for withdrawal");
		}else {
			System.out.println("Invalid withdrawal amount");
		}
	}
	
	public String toString() {
		return "BANK1 [bankCustomerName=" + bankCustomerName + ", bankAddress=" + bankAddress + ", bankIFSCCode="
				+ bankIFSCCode + ", customerAccountNumber=" + customerAccountNumber + ", currentBalance="
				+ currentBalance + ", bankName=" + bankName + "]";
	}
	
}
