package EXAM;
class abhi {
    int number = 10;
    
    public void display() {
        System.out.println(number);
    }
}

public class Test {
    public static void main(String[] args) {
    	abhi obj = new abhi();
        System.out.println(obj.number);
    }
}