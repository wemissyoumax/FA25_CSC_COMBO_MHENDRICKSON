import java.util.Scanner;

public class TempConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        double kelvin = celsius + 273.15;

        System.out.printf("Temperature in Celsius: %.2f °C\n", celsius);
        System.out.printf("Temperature in Kelvin: %.2f K\n", kelvin);

        scanner.close();
    }
}
