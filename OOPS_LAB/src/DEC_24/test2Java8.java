package DEC_24;

import java.util.function.Consumer;

public class test2Java8 {

    public static void main(String[] args) {
        Consumer<Integer> printWithNareshIT = a -> System.out.println("NareshIT " + (a + 1));
        printWithNareshIT.accept(5); 
    }
}
