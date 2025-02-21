package JAN_29_For_each;
import java.util.*;
import java.util.function.Consumer;

public class ForEachMethodInternalDemo1 {
	public static void main(String[] args) {
		Vector<String>fruits = new Vector<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("kiwi");
		fruits.add("Grapes");
		
		//Anonymous inner class
		Consumer<String> cons = new Consumer<String>() {
			
			@Override
			public void accept(String fruits) {
				System.out.println(fruits.toUpperCase());
				
			}
		};
		fruits.forEach(cons);
	}

}
