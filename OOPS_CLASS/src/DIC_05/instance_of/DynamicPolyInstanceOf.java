package DIC_05.instance_of;

import java.util.Scanner;

class Payment {
    public double makePayment(double amount) {
        return amount;
    }
}

class UPI extends Payment {
    @Override
    public double makePayment(double amount) {
        System.out.println("Making a payment of " + amount + " through UPI");
        return amount;
    }

    public void offer() {
        System.out.println("Make first payment and get 100 RS");
    }
}

class CreditCard extends Payment {
    @Override
    public double makePayment(double amount) {
        System.out.println("Making a payment of " + amount + " through Credit Card");
        return amount;
    }

    public void offer() {
        System.out.println("Make first payment and get a holiday ticket");
    }
}

public class DynamicPolyInstanceOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a payment method: ");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        int choice = scanner.nextInt();
        
        System.out.printf("Enter the payment amount: ");
        double amount = scanner.nextDouble();
        
        Payment payment = null;
        
       
        if (choice == 1) {
            payment = new UPI();
        } else if (choice == 2) {
            payment = new CreditCard();
        } else {
            System.out.println("Invalid choice! Exiting...");
            scanner.close();
            return;
        }
        
        
        acceptPayment(payment, amount);
        scanner.close();
    }

    public static void acceptPayment(Payment payment, double amount) {
        if (payment instanceof UPI) {
            UPI u = (UPI) payment;
            u.makePayment(amount);
            u.offer();
        } else if (payment instanceof CreditCard) {
            CreditCard cc = (CreditCard) payment;
            cc.makePayment(amount);
            cc.offer();
        }
    }
}
