package while_loops;
import java.util.*;

public class one_to_n_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N number: ");
		int n = sc.nextInt();
		
		int num = 1 ;
		while (num <=n) {
			System.out.print(num+" ");
			num++;
		}	 
	}

}
