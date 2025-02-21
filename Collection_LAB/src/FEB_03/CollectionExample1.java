package FEB_03;

import java.util.*;
public  class CollectionExample1 {
	public static void main(String[] args) {
		List <String> List = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(List);
		for(String str: List)
			System.out.print(str+" ");
	}

}
