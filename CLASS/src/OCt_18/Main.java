package OCt_18;

public class Main {
    public static void main(String[] args) {
    	int number = 83;
        int result = TwoDigitsDifference.getDiffOfDigits(number);
        System.out.println("Difference of digits of " + number + " is: " + result); // Output: 5

        number = 38;
        result = TwoDigitsDifference.getDiffOfDigits(number);
        System.out.println("Difference of digits of " + number + " is: " + result); // Output: -5

        number = 40;
        result = TwoDigitsDifference.getDiffOfDigits(number);
        System.out.println("Difference of digits of " + number + " is: " + result);
    }
}

