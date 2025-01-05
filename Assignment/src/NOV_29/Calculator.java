package NOV_29;

public class Calculator {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

       
        double sum = mathOps.add(10.5, 20.3);
        System.out.println("Sum of 10.5 and 20.3 (double): " + sum);

       
        int product = mathOps.multiply(10, 20);
        System.out.println("Product of 10 and 20 (int): " + product);

       
        int negativeSum = mathOps.add(-10, 20);
        System.out.println("Sum of -10 and 20 (int): " + negativeSum);
    }
}
