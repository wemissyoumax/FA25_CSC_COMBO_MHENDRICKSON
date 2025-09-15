import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double num = scanner.nextDouble();

        if (num == 0) {
            System.out.println("zero");
        } else {
            if (num > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            double absValue = Math.abs(num);
            if (absValue < 1) {
                System.out.print(" small");
            } else if (absValue > 1000000) {
                System.out.print(" large");
            }

            System.out.println();
        }

        scanner.close();
    }
}
