package DIC_7;


class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Balance: " + balance;
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate > 0) {
            this.interestRate = interestRate;
        } else {
            System.out.println("Invalid interest rate.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Interest Rate: " + interestRate + "%";
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }
}


public class MainBank {
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount(1000.0, 5.0);
        System.out.println("Previous Balance: " + savings);
        savings.deposit(200.0);
        savings.calculateInterest();
        System.out.println("Savings Account Balance: " + savings);

      
        CheckingAccount checking = new CheckingAccount(1000.0);
        System.out.println("\nPrevious Balance: " + checking);
        checking.deposit(300.0);
        checking.withdraw(100.0);
        System.out.println("Checking Account Balance: " + checking);
    }
}
