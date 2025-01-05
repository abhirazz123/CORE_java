package Day_2;
public class TaxCalculator {
    public static void main(String[] args) {
        double income = 990000;
        double taxRate = 4.9 / 100;
        double tax = income * taxRate;
        System.out.println("The calculated tax on Rs. 9,90,000 at 4.9% is: Rs. " + tax);
    }
}