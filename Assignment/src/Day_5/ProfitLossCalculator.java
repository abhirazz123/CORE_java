package Day_5;
import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double costPrice, sellingPrice, profit, loss, profitPercentage, lossPercentage;

            System.out.print("Enter Cost Price (CP): ");
            costPrice = scanner.nextDouble();

            System.out.print("Enter Selling Price (SP): ");
            sellingPrice = scanner.nextDouble();

            if (sellingPrice > costPrice) {
                profit = sellingPrice - costPrice;
                profitPercentage = (profit / costPrice) * 100;
                System.out.println("Profit: " + profit);
                System.out.println("Profit Percentage: " + profitPercentage + "%");
            } else if (costPrice > sellingPrice) {
                loss = costPrice - sellingPrice;
                lossPercentage = (loss / costPrice) * 100;
                System.out.println("Loss: " + loss);
                System.out.println("Loss Percentage: " + lossPercentage + "%");
            } else {
                System.out.println("No Profit No Loss");
            }
        }

    }
}