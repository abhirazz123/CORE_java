package OCt_25.variable_copy_demo.Assignment;


class Customer {

 private int customerId;
 private String name;
 private double accountBalance;


 public Customer(int customerId, String name, double accountBalance) {
     this.customerId = customerId;
     this.name = name;
     this.accountBalance = accountBalance;
 }

 
 public int getCustomerId() {
     return customerId;
 }

 public String getName() {
     return name;
 }

 public double getAccountBalance() {
     return accountBalance;
 }

 public void setAccountBalance(double accountBalance) {
     this.accountBalance = accountBalance;
 }
}


class Bank {

 private String bankName;


 public Bank(String bankName) {
     this.bankName = bankName;
 }

 public void deposit(Customer customer, double amount) {
     if (amount > 0) {
         double newBalance = customer.getAccountBalance() + amount; 
         customer.setAccountBalance(newBalance);
         System.out.println("Deposit Successful. New Balance: " + customer.getAccountBalance());
     } else {
         System.out.println("Invalid Deposit Amount.");
     }
 }


 public void withdraw(Customer customer, double amount) {
     if (amount > 0 && customer.getAccountBalance() >= amount) {
         double newBalance = customer.getAccountBalance() - amount; 
         customer.setAccountBalance(newBalance);
         System.out.println("Withdrawal Successful. New Balance: " + customer.getAccountBalance());
     } else {
         System.out.println("Insufficient Balance or Invalid Withdrawal Amount.");
     }
 }


 public void calculateInterest(Customer customer, double interestRate) {
     double interest = customer.getAccountBalance() * (interestRate / 100); 
     System.out.println("Interest Earned: " + interest);
 }
}


public class BankApplication2 {
 public static void main(String[] args) {
  
     Bank bank = new Bank("Global Bank");

    
     Customer customer = new Customer(1, "Abhi razz", 5000);

 
     System.out.println("Welcome " + customer.getName() + "!");

     bank.deposit(customer, 2000);
     bank.withdraw(customer, 1000);
     bank.calculateInterest(customer, 5.0);
 }
}
