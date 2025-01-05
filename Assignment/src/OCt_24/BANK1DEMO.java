package OCt_24;
import java.util.*;
public class BANK1DEMO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BANK1 BANK = new BANK1();
		
		System.out.print("Enter the Bank Name: ");
		String bankName = sc.nextLine();
		
		System.out.print("Enter the Bank Customer Name:");
		String bankCustomerName = sc.nextLine();
		
		System.out.print("Enter the Bank Address:");
		String bankAddress = sc.nextLine();
		
		System.out.print("Enter the Bank IFSC Code:");
		String bankIFSCCode = sc.nextLine();
		
		System.out.print("Enter the Customer Account Number: ");
		int customerAccountNumber = sc.nextInt();
		
		System.out.print("Enter the current Balance:");
		int currentBalance = sc.nextInt();	
		BANK.setkDeatils(bankName, bankAddress, bankIFSCCode, bankCustomerName, customerAccountNumber, currentBalance);
		
		System.out.print("Bank and Customer Details:");
		System.out.println(BANK.toString());
		
		System.out.print("Enter amount to deposit: ");
		int depositAmount = sc.nextInt();		
		BANK.deposit(depositAmount);
		
		System.out.print("Enter amount to withdraw: ");
		int withdrawamount = sc.nextInt();
		BANK.withdraw(withdrawamount);
		
		
	
		
	}

}
