package FAB_07;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Write a program to merge to Collection data which contains fruits name.

public class MergeCollections {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Cherry");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Date");
        collection2.add("Elderberry");
        collection2.add("Fig");

        Collection<String> mergedCollection = new ArrayList<>(collection1);
        mergedCollection.addAll(collection2);

        System.out.println("Merged Collection: " + mergedCollection);
    }
}