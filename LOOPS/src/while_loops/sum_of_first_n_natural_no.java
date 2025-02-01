package while_loops;
import java.util.*;

public class sum_of_first_n_natural_no {
	public static void main(String[] args) {
	
		System.out.println("Enter the N Number : ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= N) {
			sum  = sum+i;
			
			System.out.print(i+" + ");
			i++;
			
		}  
		System.out.println("= " +sum);
		
	}

}
