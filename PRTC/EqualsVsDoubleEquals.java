public class EqualsVsDoubleEquals {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println(str1 == str2); // false: compares memory reference
        System.out.println(str1.equals(str2)); // true: compares actual content

        System.out.println(str3 == str4); // true: both refer to the same literal in string pool
        System.out.println(str3.equals(str4)); // true: compares actual content
    }
}
