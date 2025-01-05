package OCt_25.variable_copy_demo.Assignment;

public class BankAccount {
  
    private String accountNumber;
    private String customerName;
    private double accountBalance;

  
    public BankAccount(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountBalance = initialBalance;
    }

 
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
    
        double tempBalance = accountBalance + amount;
        accountBalance = tempBalance; 
        System.out.println("Successfully deposited " + amount);
    }

    public boolean withdraw(double amount) {
        
        if (amount <= accountBalance) {
            double tempBalance = accountBalance - amount;
            accountBalance = tempBalance; 
            System.out.println("Successfully withdrew " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance!");
            return false;
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Balance: " + accountBalance);
    }
}
