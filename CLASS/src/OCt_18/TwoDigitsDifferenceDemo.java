package OCt_18;
import java.util.*;
public class TwoDigitsDifferenceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int num = sc.nextInt();
		int resutl =TwoDigitsDifference.getDiffOfDigits(num);
		System.out.println("Next Multiple Of Hundred: "+resutl);
	}

}
