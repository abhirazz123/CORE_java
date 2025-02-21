package FAB_03;
import java.util.*;
public class CollectionExample4 {
	public static void main(String[] args) {
		ArrayList<String>al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		al.add("4");
		al.remove(3);
		for(String str:al) {
			System.out.println(str+ " ");
		}
	}

}
