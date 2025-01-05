package OCt_24;

public class Customer1 {

	   private String bankName;
	    private String bankCustomerName;
	    private String bankAddress;
	    private String bankIFSCCode;
	    private int customerAccountNumber;
	    private int currentBalance;

	   
	    public void setDetails(String bankName, String bankCustomerName, String bankAddress, String bankIFSCCode, int customerAccountNumber, int currentBalance) {
	        this.bankName = bankName;
	        this.bankCustomerName = bankCustomerName;
	        this.bankAddress = bankAddress;
	        this.bankIFSCCode = bankIFSCCode;
	        this.customerAccountNumber = customerAccountNumber;
	        this.currentBalance = currentBalance;
	    }
	    public void withdraw(double Amount) 
	    {
	    	if(currentBalance<1000) {
	    		System.out.println("Insufficient Balance");
	    	}else if(currentBalance -Amount <1000) {
	    		 System.out.println("Maintain MinimumBalance");
	    	}else {
	    		currentBalance -= Amount;
	            System.out.println("Transaction Successful.");
	    		System.out.println("After withdraw currentBalance "+currentBalance);
	    	}
	    }
	    public void deposit(double Amount ) {
	    	currentBalance += Amount;
	    	System.out.println("Deposited Successfully.");
	    	currentBalance();
	    	
	    }
	    public void currentBalance() {
	    	System.out.println("Available Balance : Rs." + currentBalance + ".0");
	    }
		@Override
		public String toString() {
			return "Customer1 [bankName=" + bankName + ", bankCustomerName=" + bankCustomerName + ", bankAddress="
					+ bankAddress + ", bankIFSCCode=" + bankIFSCCode + ", customerAccountNumber="
					+ customerAccountNumber + ", currentBalance=" + currentBalance + "]";
		}
	   
}
