package JAN_30;

import java.util.*;

public class VectorDemo3 {
	public static void main(String[] args) {
		Vector obj = new Vector();
		obj.addElement(new Integer(3));
		obj.addElement(new Integer(2));
		obj.addElement(new Integer(6));
		obj.insertElementAt(new Integer(8), 3);
		
		System.out.println(obj);
		
	}

}
