package OCT_17.for_each_loop;

public class ForEachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        String[] words = {"Hello", " ", "World", "!"};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of Integer Array: " + sum);

        StringBuilder concatenatedString = new StringBuilder();
        for (String word : words) {
            concatenatedString.append(word);
        }
        System.out.println("Concatenated String: " + concatenatedString.toString());
    }
}
