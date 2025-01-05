package Day_1;
public class FactorialCalculator {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
