package Day_3;
public class FahrenheittoCelsius {
    public static void main(String[] args) {

        double fahrenheit = Double.parseDouble(args[0]);
        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("Temperature in Celsius: %.2f%n", celsius);

    }

}
