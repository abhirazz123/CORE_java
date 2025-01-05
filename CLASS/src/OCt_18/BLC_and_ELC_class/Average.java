package OCt_18.BLC_and_ELC_class;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt(); // Get the count of numbers to be averaged
        double[] numbers = new double[n];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble(); // Get each number from the user
        }
        
        double average = Averagedemo.calculateAverage(numbers); // Calculate average
        System.out.println("The average is: " + average);
        
        sc.close(); // Close the scanner
    }
}
