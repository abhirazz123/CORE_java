package FAB_03;

import java.util.ArrayList;
import java.util.Collection;

public class Test11 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		
		Collection c1 = new ArrayList();
		c1.add("1");
		c1.add("2");
		c1.add("5");
		c1.add("4");
		c.retainAll(c1);
		System.out.println(c);
	}

}
