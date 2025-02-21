package JAN_30_Vector;
import java.util.*;
import java.util.Vector;

public class VectorDemo1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(100,9);
		 System.out.println("initial Capacity is:"+v.capacity());
		 for(int i=0; i<100; i++) {
			 v.add(i);
		 }
		 System.out.println("After adding 100 elements capacity is: "+v.capacity());
		 v.add(101);
		 System.out.println("After adding 101 elements capacity is: "+v.capacity());
		 for(int i =0; i<v.size(); i++) {
			 if(i%5==0) {
				 System.out.println();
			 }
			 System.out.println(v.get(i)+"\t");
		 }
	}

}
