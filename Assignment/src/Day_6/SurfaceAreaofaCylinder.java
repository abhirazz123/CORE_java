package Day_6;
import java.util.Scanner;

public class SurfaceAreaofaCylinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the R value: ");
        double r = sc.nextDouble();
        System.out.printf("Enter the H value: ");// 2πr (h + r)
        double h = sc.nextDouble();

        double SurfaceAreaofaCylinder = 2 * 3.14 * r * (h + r);
        System.out.printf("Surface Area of a Cylinder : %.2f\n", SurfaceAreaofaCylinder);

    }
}
