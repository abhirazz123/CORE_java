package EXAM;

class MainClass { // Renamed the class to follow Java naming conventions
    private int number = 10;

    public int getNumber() {
        return number;
    }

    public void display() {
        System.out.println(number);
    }
}

public class MyClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass(); // Updated to match the renamed class
        System.out.println(obj.getNumber());
    }
}
