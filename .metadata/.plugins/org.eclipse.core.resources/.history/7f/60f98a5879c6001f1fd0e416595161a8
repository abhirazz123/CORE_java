package DEC_30;
import java.util.*;
public class DivisionExample {

	public static int performDivision(int dividend, int divisor) {
		
		if(divisor ==0) {
			throw new ArithmeticException("Division by zero: dividend=" + dividend + ", divisor=" + divisor);
		}
		return dividend/divisor;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("Test Case 1: Valid division");  
	        System.out.print("Enter dividend: ");  
	        int dividend = sc.nextInt();  
	        System.out.print("Enter divisor: ");  
	        int divisor = sc.nextInt();  
		
	        try {
	        	int result = performDivision(dividend, divisor);
	        	System.out.println("Result of dividend : "+result);
	        	
	        }catch(ArithmeticException e) {
	        	System.out.println("ArithmeticException caught : "+e.getMessage());
	        }
	        
	        System.out.println("Test case 2 : invalid divsion");
	        System.out.println("Enter the dividend : ");
	         dividend = sc.nextInt();
	         System.out.println("Enter the divisor");
	         divisor = sc.nextInt();
	         
	         try {
	        	int result = performDivision(dividend, divisor);
	        	System.out.println("ArithmeticException caught : "+result);
	         }
	         catch(ArithmeticException e )
	         {
	        	 System.out.println("ArithmeticException caught : "+e.getMessage());
	        	 
	         }
	}
}
