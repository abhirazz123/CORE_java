import java.util.Scanner;
public class CountOnesAndZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String input = scanner.nextLine();

        int countOnes = 0;
        int countZeros = 0;

        for (char ch : input.toCharArray()) {
            if (ch == '1') {
                countOnes++;
            } else if (ch == '0') {
                countZeros++;
            }
        }

        System.out.println("Count of 1's: " + countOnes);
        System.out.println("Count of 0's: " + countZeros);
    }
}
