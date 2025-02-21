package JAN_29_for_each_method_internals;

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo2 
{
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Gripes");
	//lamda
		Consumer<String> con = fruit -> System.out.println(fruit.toUpperCase());
		fruits.forEach(con);
	}
	

}
