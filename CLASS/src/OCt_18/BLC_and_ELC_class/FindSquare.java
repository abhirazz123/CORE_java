package OCt_18.BLC_and_ELC_class;
import java.util.*;
public class FindSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no : ");
		int side = sc.nextInt();
		int valu =FindSquaredemo.getSquare(side) ;
		System.out.println("Square of "+side+" is :"+valu);
		sc.close();

	}

}
