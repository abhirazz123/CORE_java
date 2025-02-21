package JAN_29_For_each;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//WAP that describes how to retrieve the Objects by using above 9 ways :


public class RetrievingCollectionObject {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Kiwi");
		fruits.add("Grapes");
		 
		System.out.println("1) By USING TOSTRING METHOD : ");
		System.out.println("\t"+fruits.toString());
		System.out.println("======================================");
		
		System.out.println("2) By USING ORDINARY FOR LOOP : ");
		for(int i = 0; i<fruits.size();i++) {
			System.out.println("\t"+fruits.get(i));
		}
		
		System.out.println("======================================");
		System.out.println("3) BY USING FOR EACH LOOP : ");
		for(String fruit: fruits) {
			System.out.println("\t"+fruit);
		}
		System.out.println("======================================");
		System.out.println(" 4) BY USING ENUMARATION INTERFACE : ");
		Enumeration<String>ele = fruits.elements();
		while(ele.hasMoreElements()) {
			System.out.println("\t"+ele.nextElement());
		}
		System.out.println("======================================");
		System.out.println(" 5) BY USING ITERATOR INTERFACE : ");
		
		Iterator<String> itr = fruits.iterator();
		itr.forEachRemaining(fruit -> System.out.println(fruit));
		
	}

}
