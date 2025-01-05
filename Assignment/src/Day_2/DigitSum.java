package Day_2;
public class DigitSum {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int digit1 = number / 10;
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        System.out.println("The sum of digits of " + number + " is " + sum);
    }
}