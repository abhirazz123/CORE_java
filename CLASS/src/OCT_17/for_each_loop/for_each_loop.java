package OCT_17.for_each_loop ;
import java.util.*;
public class for_each_loop {

	public static void main(String[] args) {
int []arr = {50,40,30,20,10};
		
		Arrays.sort(arr);     
		
		for(int x : arr)   
		{
			System.out.println(x);
		}
	}
		
}

