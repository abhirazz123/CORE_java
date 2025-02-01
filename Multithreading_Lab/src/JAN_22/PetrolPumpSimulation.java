package JAN_22;
class PetrolPump{
 
	public synchronized void refillCar(String carName   ) {
	 try {
		 System.out.println(carName + "Staring refilling");
		 Thread.sleep(1000);
		 System.out.println(carName + "completed refilling!");
	 }catch(InterruptedException e) {
		 System.out.println("Refilling interrupted for " + carName);
		  Thread.currentThread().interrupt();
	 }
		
	}
}
class Car implements Runnable {
    private final String name;
    private final PetrolPump petrolPump;

   public Car(String name, PetrolPump petrolPump) {
	   this.name = name;
	   this.petrolPump = petrolPump;
   }

@Override
public void run() {
	 petrolPump.refillCar(name);
	}	
}
public class PetrolPumpSimulation {
	public static void main(String[] args) {
		 PetrolPump petrolPump = new PetrolPump();
		 
		 String []carNames = {" Porsche "," Ferrari "," BMW M8 "," Jaguar F-Type "," Aston Martin ", };
		 Thread[] carThreads = new Thread[carNames.length];

	        
	        for (int i = 0; i < carNames.length; i++) {
	            Car car = new Car(carNames[i], petrolPump);  
	            carThreads[i] = new Thread(car);           
	            carThreads[i].start();                    
	        }

	       
	        for (Thread thread : carThreads) {
	            try {
	                thread.join();
	            } catch (InterruptedException e) {
	                System.out.println("Main thread interrupted while waiting for car threads.");
	                Thread.currentThread().interrupt();  
	            }
	        }

	        System.out.println("All cars have completed refilling.");
	    }
	}
