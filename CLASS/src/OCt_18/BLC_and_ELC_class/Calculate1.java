package OCt_18.BLC_and_ELC_class;
/*Program to find out the square and cube of 
the number by following criteria
* 
a) If number is 0 or Negative it should return -1
b) If number is even It should return square of the number
c) If number is odd It should return cube of the number
*/

import java.util.*;
public class Calculate1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Enter the no: ");
			int num = sc.nextInt();
			
			int number = Calculate1Demo.CalculateOfcube(num);
			System.out.print(number);
		}
		
		

	}

}
