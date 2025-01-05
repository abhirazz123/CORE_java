package OCt_18.BLC_and_ELC_class;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the R value =");
		double  r = sc.nextDouble();
		
		double R = Circledemo.AreaofCircle(r);
		System.out.println("Area of Circle ="+R);

	}

}
