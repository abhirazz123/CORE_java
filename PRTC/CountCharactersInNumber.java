import java.util.Scanner;

public class CountCharactersInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        
        int count = countCharacters(number);
        System.out.println("Number of characters (digits) in the given number: " + count);
    }

    public static int countCharacters(long num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
