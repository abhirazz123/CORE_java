package Day_6;
import java.util.Scanner;

public class CurvedSurfaceAreaofaCube {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter the no of cube: ");
            double a = sc.nextDouble();
            double CSA = 6 * a * a;
            System.out.printf("Curved Surface Area of a Cube: " + CSA);
        }

    }

}
