package OCt_24;

import java.util.Scanner;

public class CustomerDemo {
    public static void main(String[] args) {
        // Create an instance of the Bank class
    	Customer bank = new Customer();

        Scanner scanner = new Scanner(System.in);

        // Input customer details
        System.out.println("Enter Bank Name:");
        String bankName = scanner.nextLine();

        System.out.println("Enter Customer Name:");
        String bankCustomerName = scanner.nextLine();

        System.out.println("Enter Bank Address:");
        String bankAddress = scanner.nextLine();

        System.out.println("Enter Bank IFSC Code:");
        String bankIFSCCode = scanner.nextLine();

        System.out.println("Enter Account Number:");
        int customerAccountNumber = scanner.nextInt();

        System.out.println("Enter Current Balance:");
        int currentBalance = scanner.nextInt();

        // Set the details
        bank.setDetails(bankName, bankCustomerName, bankAddress, bankIFSCCode, customerAccountNumber, currentBalance);

        // Perform operations
        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Current Balance");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;

                case 3:
                    bank.currentBalance();
                    break;

                case 4:
                    System.out.println(bank.displayDetails());
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
