package Array;
import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		int arr [] =  {2,3,10,4,20,0,0,1,0};
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min >arr[i]) {
				min = arr[i];
			}
			
		}
		min++;
		boolean f = false;
		for(int k =0; k<arr.length; k++) {
			System.out.println(arr[k]);
			f = true;
			break;
			
		}	
		if(f = true) {
		
		}
	
		

	}
	

}
