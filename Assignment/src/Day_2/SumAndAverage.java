package Day_2;
public class SumAndAverage {
    public static void main(String[] args) {

        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);
        double number3 = Double.parseDouble(args[2]);

        double Sum = number1 + number2 + number3;
        double SumAndAverage = Sum / 3;

        System.out.println("The sum of digits of " + Sum + " is " + SumAndAverage);
    }
}