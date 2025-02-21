package JAN_30;

import java.util.ArrayList;

public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList ();
		ArrayList obj2 = new ArrayList ();
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		obj2.add("B");
		
		System.out.println(obj1.equals(obj2)); // true
		System.out.println(obj1 == obj2); // false
		
		
	}

}
