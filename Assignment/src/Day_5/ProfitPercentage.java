package Day_5;
import java.util.Scanner;

public class ProfitPercentage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double costPrice, sellingPrice, profit, loss, profitPercentage, lossPercentage;

            System.out.printf("Enter your cost Price :");
            costPrice = sc.nextDouble();

            System.out.printf("Enter the selling Price: ");
            sellingPrice = sc.nextDouble();
            if (sellingPrice > costPrice) {
                profit = sellingPrice - costPrice;
                profitPercentage = (profit / sellingPrice) * 100;

                System.out.printf("Profit =" + profit);
                System.out.printf("profit Percentage = " + profitPercentage);

            } else if (sellingPrice < costPrice) {
                loss = costPrice - sellingPrice;
                lossPercentage = (loss / costPrice) * 100;

                System.out.println("LOss =" + loss);
                System.out.println("profit Percentage = " + lossPercentage);

            }

            else {
                System.err.println("Envlid");
            }
        }

    }

}
