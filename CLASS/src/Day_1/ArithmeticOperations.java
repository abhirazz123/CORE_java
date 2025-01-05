package Day_1;
public class ArithmeticOperations {
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 10;
        double result;

        result = num1 + num2;
        System.out.println("Addition: " + result);

       
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

     
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

      
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
