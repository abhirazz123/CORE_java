package JAN_29_for_each_method_internals;
import java.util.*;
import java.util.function.Consumer;
public class ForEachMethodInternalDemo1 {
	public static void main(String[] args) {
		Vector<String> fruit = new Vector<String>();
		fruit.add("Orangle");
		fruit.add("Apple");
		fruit.add("Mango");
		fruit.add("Kiwi");
		fruit.add("Grapes");
		
		//anonymous inner class
		Consumer<String> cons = new Consumer<String>() {

			@Override
			public void accept(String fruit) {
				System.out.println(fruit.toUpperCase());
				
			}
			
		};
		fruit.forEach(cons);
		
		
	}
}
//How forEach(Consumer<T> cons) method works internally ?