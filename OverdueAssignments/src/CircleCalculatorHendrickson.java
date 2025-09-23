import java.util.Scanner;

public class CircleCalculatorHendrickson {

    public static double calculateDiameter(double radius) {
        return 2 * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double diameter = calculateDiameter(radius);
        double circumference = calculateCircumference(radius);
        double area = calculateArea(radius);

        System.out.printf("Diameter: %.2f\n", diameter);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);

        scanner.close();
    }
}
