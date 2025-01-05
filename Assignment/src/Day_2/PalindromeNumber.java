package Day_2;

public class PalindromeNumber {
    public static void main(String[] args) {

        // Check if input is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int num = Integer.parseInt(args[0]); // Convert input to integer
        int originalNumber = num; // Store the original number
        int reversedNumber = 0; // Variable to store the reversed number

        // Reverse the number
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit
        }

        // Check if the number is a palindrome
        if (originalNumber == reversedNumber) {
            System.out.println("This is a Palindrome Number.");
        } else {
            System.out.println("This is not a Palindrome Number.");
        }
    }
}
