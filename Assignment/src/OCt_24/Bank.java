package OCt_24;

public class Bank {
	private String  bankName;
	private String  bankCustomerName;
	private String  bankAddress;
	private String  bankIFSCCode;
	private int  customerAccountNumber;
	private int  currentBalance;
	
		public void setBankDeatils(String  bankName,String bankAddress,String bankIFSCCode)
	{
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankIFSCCode = bankIFSCCode;
		
	}
		public void setCustemberDeatils(String bankCustomerName, int currentBalance, int customerAccountNumber) {
		this.bankCustomerName=bankCustomerName;
		this.customerAccountNumber =customerAccountNumber;
		this.currentBalance =currentBalance;
		System.out.println("current Balance = "+currentBalance);
	}
		public void deposit(double depositAmount ) {
		if (depositAmount>=0) {
			currentBalance +=depositAmount;
			
			System.out.println("Deposited: " + depositAmount + ". New Balance: " + currentBalance);
  }else {
		
			System.out.println("Invalid deposit amount");
		}
			
					
	}
		public void withdraw (int amount) {
			if (amount>=0 && amount<=currentBalance) {
				currentBalance =currentBalance-amount;
				System.out.println("withdraw : "+amount+".New Balance="+currentBalance);
			}else if (currentBalance<amount) {
				System.out.println("Insufficient balance for withdrawal");
			}else {
				System.out.println("Invalid withdrawal amount");
			}
			
		}
		
		
		
		public String toString() {
			return "Bank [bankName =" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress="
					+ bankAddress + ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber="
					+ customerAccountNumber + ", currentBalance=" + currentBalance + "]";
		}

}
	
	

