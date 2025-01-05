package NOV_27;

 
class Driver {  
 private String name;  
 private int age;  

  
 public Driver(String name, int age) {  
     if (age <= 0) {  
         System.out.println("Error Invalid Input");  
         return;  
     }  
     this.name = name;  
     this.age = age;  
 }  

 
 public String getName() {  
     return name;  
 }  

 public void setName(String name) {  
     this.name = name;  
 }  

 public int getAge() {  
     return age;  
 }  

 public void setAge(int age) {  
     if (age <= 0) {  
         System.out.println("Error Invalid Input");  
         return;  
     }  
     this.age = age;  
 }  
}  

 
class Car {  
 private String brand;  
 private String model;  
 private int year;  
 private Driver driver;  

  
 public Car(String brand, String model, int year, Driver driver) {  
     if (year <= 0) {  
         System.out.println("Error Invalid Input");  
         return;  
     }  
     this.brand = brand;  
     this.model = model;  
     this.year = year;  
     this.driver = new Driver(driver.getName(), driver.getAge()); // Deep copy  
 }  

 
 public Car(Car car) {  
     this.brand = car.brand;  
     this.model = car.model;  
     this.year = car.year;  
     this.driver = new Driver(car.driver.getName(), car.driver.getAge()); // Deep copy  
 }  

  
 public String getBrand() {  
     return brand;  
 }  

 public void setBrand(String brand) {  
     this.brand = brand;  
 }  

 public String getModel() {  
     return model;  
 }  

 public void setModel(String model) {  
     this.model = model;  
 }  

 public int getYear() {  
     return year;  
 }  

 public void setYear(int year) {  
     if (year <= 0) {  
         System.out.println("Error Invalid Input");  
         return;  
     }  
     this.year = year;  
 }  

 public Driver getDriver() {  
     return driver;  
 }  

 public void setDriver(Driver driver) {  
     this.driver = new Driver(driver.getName(), driver.getAge()); // Deep copy  
 }  

 public void changeDriver(Driver newDriver) {  
     this.driver = new Driver(newDriver.getName(), newDriver.getAge()); // Deep copy  
 }  

 public void printCarDetails() {  
     System.out.println("Car Brand: " + brand);  
     System.out.println("Car Model: " + model);  
     System.out.println("Car Year: " + year);  
     System.out.println("Driver Name: " + driver.getName());  
     System.out.println("Driver Age: " + driver.getAge());  
 }  
}  

 
