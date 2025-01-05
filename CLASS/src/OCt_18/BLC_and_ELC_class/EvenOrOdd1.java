package OCt_18.BLC_and_ELC_class;
import java.util.*;
public class EvenOrOdd1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no= ");
		int num = sc.nextInt();
		
		boolean isEven =EvenOrOdd1Demo.isEven(num) ;
		System.out.println(num+" is Even ?:"+isEven);

	}

}
