package NOV_27;

public class Main {  
	 public static void main(String[] args) {  
	     Driver driver1 = new Driver("A", 30);  
	     Car car1 = new Car("Hyundai", "Creta", 2020, driver1);  
	     
	     Driver driver2 = new Driver("Logan", 35);  
	     
	    
	     Car carCopy = new Car(car1);  
	     
	    
	     System.out.println("Original Car Details:");  
	     car1.printCarDetails();  
	     System.out.println();  
	     
	     System.out.println("Copied Car Details:");  
	     carCopy.printCarDetails();  
	     System.out.println();  
	     
	    
	     car1.changeDriver(driver2);  
	     
	  
	     System.out.println("Original Car Details after Changing Driver:");  
	     car1.printCarDetails();  
	     System.out.println();  
	     
	     System.out.println("Copied Car Details after Changing Driver in Original Car:");  
	     carCopy.printCarDetails();  
	 }  
	}  