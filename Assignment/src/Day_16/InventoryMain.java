package Day_16;
import java.util.*;
public class InventoryMain {
    public static void main(String[] args) {
       
        InventoryItem item1 = new InventoryItem("Apples", 10.0, 15);
        System.out.println("Total Value of " + item1.getItemName() + " in Stock: " + item1.calculateTotalValue());

       
        InventoryItem item2 = new InventoryItem("Oranges", -5.0, 20); 
        System.out.println("Total Value of " + item2.getItemName() + " in Stock: " + item2.calculateTotalValue());

       
        InventoryItem item3 = new InventoryItem("Bananas", 5.0, -10); 
        System.out.println("Total Value of " + item3.getItemName() + " in Stock: " + item3.calculateTotalValue());

        
        InventoryItem item4 = new InventoryItem("", 8.0, 10); 
        System.out.println("Total Value of " + item4.getItemName() + " in Stock: " + item4.calculateTotalValue());
    }
}
