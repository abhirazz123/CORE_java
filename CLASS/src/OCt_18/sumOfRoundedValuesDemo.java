package OCt_18;
import java.util.*;
public class sumOfRoundedValuesDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A no : ");
		int A =sc.nextInt();
		System.out.print("Enter the B no : ");
		int B = sc.nextInt();
		System.out.print("Enter the C no : ");
		int C = sc.nextInt();
		int result = RoundedSum.sumOfRoundedValues(A, B, C);
		System.out.println("sum Of Rounded Values:"+result);
		
	}

}
