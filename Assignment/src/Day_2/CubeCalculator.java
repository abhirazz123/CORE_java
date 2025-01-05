package Day_2;
public class CubeCalculator {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        int cube = number * number * number;
        System.out.println("The cube of " + number + " is " + cube);

    }
}