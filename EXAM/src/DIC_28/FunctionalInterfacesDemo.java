package DIC_28;

@FunctionalInterface
interface BooleanOperation {
    boolean evaluate(int a, int b);
}

@FunctionalInterface
interface DoubleFunction {
    double calculate(double x, double y);
}

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
     
        BooleanOperation booleanOperation = new BooleanOperation() {
            @Override
            public boolean evaluate(int a, int b) {
                return (a % 3 == 0) && (b % 5 == 0) && ((a + b) % 2 == 0);
            }
        };

        
        DoubleFunction doubleFunction = new DoubleFunction() {
            @Override
            public double calculate(double x, double y) {
                if (x > 0 && y < 0 && x % 2 == 0) {
                    return y != 0 ? Math.pow(x, 3) / y : 1.0;
                } else if (x < 0 && y > 0 && y % 2 != 0) {
                    return x * y * x * y;
                }
                return x + y;
            }
        };

       
        int a = 9, b = 15;
        System.out.println("BooleanOperation result: " + booleanOperation.evaluate(a, b));

     
        double x = -6.0, y = 3.0;
        System.out.println("DoubleFunction result: " + doubleFunction.calculate(x, y));
    }
}
