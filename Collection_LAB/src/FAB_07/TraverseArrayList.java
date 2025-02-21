package FAB_07;
import java.util.ArrayList;
import java.util.ListIterator;

//Write a Program to traverse the elements of ArrayList in both the    direction i.e forward and Backward.
public class TraverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

       
        System.out.println("Traversing forward:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       
        System.out.println("Traversing backward:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}