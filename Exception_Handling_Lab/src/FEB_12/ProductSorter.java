package FEB_12;
import java.util.Comparator;
import java.util.TreeSet;



public class ProductSorter {
    public static void main(String[] args) {
        TreeSet<Product> productsAsc = new TreeSet<>(Comparator.comparingInt(Product::pid));
        TreeSet<Product> productsDesc = new TreeSet<>((p1, p2) -> Integer.compare(p2.pid(), p1.pid()));
        TreeSet<Product> productsNameAsc = new TreeSet<>(Comparator.comparing(Product::pname));
        TreeSet<Product> productsNameDesc = new TreeSet<>((p1, p2) -> p2.pname().compareTo(p1.pname()));

        productsAsc.add(new Product(1, "Product A"));
        productsAsc.add(new Product(3, "Product B"));
        productsAsc.add(new Product(2, "Product C"));

        System.out.println("Products sorted by PID (Ascending): " + productsAsc);
        System.out.println("Products sorted by PID (Descending): " + productsDesc);
        System.out.println("Products sorted by Name (Alphabetical): " + productsNameAsc);
        System.out.println("Products sorted by Name (Reverse): " + productsNameDesc);
    }
}
