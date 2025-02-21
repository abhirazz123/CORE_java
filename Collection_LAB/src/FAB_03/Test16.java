package FAB_03;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Dhoni");
		list1.add("sahwag");
		list1.add("Bumrah");
		list1.add(0, "virat");
		list1.add(0,"Rohit");
		System.out.println(list1);
	}

}
