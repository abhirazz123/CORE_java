package FAB_03;

import java.util.*;

public class CollectionExample9 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.println(al.contains(5));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
		
	}

}
