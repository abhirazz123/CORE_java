package DEC_31;
 
 

public class ArrayStoreExample {

     
    public static void storeObjects() {
    
        Object[] strings = new String[5];

        try {
           
            strings[0] = "Hello";   
            strings[1] = "World";    
            strings[2] = "Java";     

            
            System.out.println("Objects stored successfully.");

 
            strings[3] = 123;  
        } catch (ArrayStoreException e) {
            
            System.out.println("ArrayStoreException caught: Incompatible type: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    
        storeObjects();
    }
}
