package JAN_30;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		Vector obj = new Vector(4,3);
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(5));
		System.out.println(obj.capacity());
	}
	

}
