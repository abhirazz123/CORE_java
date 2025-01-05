package Day_5;
import java.util.Scanner;

public class AsciiValue {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter the AsciiValue: ");
            char character = sc.nextLine().charAt(0);

            int AsciiValue = (int) character;

            System.out.printf("Ascii Value =" + AsciiValue);
        }

    }

}
