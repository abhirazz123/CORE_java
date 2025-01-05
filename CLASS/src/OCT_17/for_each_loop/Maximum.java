package OCT_17.for_each_loop;
import java.util.*;
public class Maximum {

	public static void main(String[] args) {
		int  [] number = {3, 9, 7, 15, 6};
		
		int max = number[0];
		
		for(int num:number) {
			if(num >= max) {
				max = num;
				
			}
			
		}
		System.out.println(max);

	}

}
