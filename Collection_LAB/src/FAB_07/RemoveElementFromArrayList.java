package FAB_07;
import java.util.*;
public class RemoveElementFromArrayList {
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

         
        numbers.remove(2);  
        System.out.println("After removing element at index 2: " + numbers);

       
        numbers.remove(Integer.valueOf(4)); 
        System.out.println("After removing element 4: " + numbers);
    }
}