package OCt_24;
import java.util.*;
public class CustomerDemo1 {

	public static void main(String[] args) {
		Customer1 bank = new Customer1();
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Enter the Bank Name : ");
		String bankName = sc.nextLine();
		
		System.out.println("Enter the bank Customer Name : ");
		String bankCustomerName = sc.nextLine();
		
		System.out.println("Enter the bank Address : ");
		String bankAddress =sc.nextLine();
		
		System.out.println("bank IFSC Code : ");
		String bankIFSCCode = sc.nextLine();	
		
		System.out.println("Customer Account Number");
		int customerAccountNumber = sc.nextInt();
		
		System.out.println("curren tBalance");
		int currentBalance = sc.nextInt();
		
		bank.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);
		boolean exit = false;
		while (!exit)
		{
			System.out.println("\nChoose an operation:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Current Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
            	System.out.println("Enter amount to withdraw: ");
            	double withdrawAmount = sc.nextDouble();
            	bank.withdraw(withdrawAmount);
            	break;
            	
            case 2:
            	System.out.println("Enter amount to Deposit: ");
            	double DepositAmount = sc.nextDouble();
            	bank.deposit(DepositAmount); break;
            	
            case 3:
            
            	bank.currentBalance(); break;
            	
            case 4:
            	bank.toString(); break;
            case 5: 
            	 exit = true;
                 break;
            default:
                System.out.println("Invalid choice. Please try again.");
            }
		}
	}

}
