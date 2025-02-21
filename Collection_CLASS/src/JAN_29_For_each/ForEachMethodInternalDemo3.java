package JAN_29_For_each;

import java.util.Vector;

public class ForEachMethodInternalDemo3 {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");
		
		fruits.forEach(fruit -> System.out.println(fruit.toUpperCase()));
	}

}
