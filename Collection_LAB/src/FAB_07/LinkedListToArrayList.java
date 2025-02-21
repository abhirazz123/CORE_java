package FAB_07;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {
         
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        
        System.out.println("LinkedList: "+linkedList);
         
        List<String> arrayList = new ArrayList<>(linkedList);

   
        System.out.println("ArrayList: " + arrayList);
    }
}