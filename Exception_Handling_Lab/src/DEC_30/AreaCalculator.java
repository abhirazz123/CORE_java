package DEC_30;
import java.util.*;
public class AreaCalculator {
	
	public static double calculateArea(double l , double b) {
		 if (l <= 0 || b <= 0) {  
	            throw new IllegalArgumentException("Dimensions must be positive: length=" + l + ", width=" + b);  
	        }  
		return l*b;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Test Case 1: Valid Input");
		System.out.println("Enter length of rectangle :");
		double i = sc.nextDouble();
		System.out.println("Enter width of rectangle : ");
		double b = sc.nextDouble();
		
		try {
			double result = calculateArea(i, b);
			System.out.println("");
		}catch(Exception e ) {
			
		}
	}

}
