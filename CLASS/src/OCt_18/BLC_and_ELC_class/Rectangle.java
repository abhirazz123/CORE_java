package OCt_18.BLC_and_ELC_class;
import java.util.*;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		int length = sc.nextInt();
		System.out.print("Enter the width: ");
		int width = sc.nextInt();
		
		int areaOfRectangle=RectangleDemo.areaOfRectangle(length, width);
		System.out.println("Area Of Rectangle = "+areaOfRectangle);
	}

}
