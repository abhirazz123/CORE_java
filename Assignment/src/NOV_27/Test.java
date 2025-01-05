package NOV_27;
import java.util.*;
public class Test {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Enter street: ");
        String street = scanner.nextLine();
        
        System.out.println("Enter city: ");
        String city = scanner.nextLine();
        
        Address address = new Address(street, city);
        
      
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        
        Person person = new Person(name, address);
        
       
        System.out.println(person);  
        
        scanner.close();
    }  
}