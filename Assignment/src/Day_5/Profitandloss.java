package Day_5;
// Write a java program to find the profit and loss by following the formula
// Profit and loss Formulas – 
// Profit = SP – CP
// Loss = CP – SP
// Profit percentage = (Profit /Cost Price) x 100
// Loss percentage = (Loss / Cost price) x 100

import java.util.Scanner;

public class Profitandloss {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double costPrice, sellingPrice, profit, loss, profitPercentage, lossPercentage;

            System.out.printf("Enter your cost price: ");
            costPrice = sc.nextDouble();

            System.out.printf("Enter your selling Price: ");
            sellingPrice = sc.nextDouble();

            if (costPrice < sellingPrice) {
                profit = sellingPrice - costPrice;
                profitPercentage = (profit / costPrice) * 100;

                System.out.println(" This is Profit pice: " + profit);
                System.out.println("This is profit Percentage: " + profitPercentage);

            } else if (costPrice > sellingPrice) {
                loss = costPrice - sellingPrice;
                lossPercentage = (loss / costPrice) * 100;

                System.out.println("This is loss price: " + loss);
                System.out.println("This is Loss Percentage: " + lossPercentage);
            } else {
                System.out.println("Both are  Equal ");
            }
        }
    }
}