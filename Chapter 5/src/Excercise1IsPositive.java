import java.util.Scanner;

public class Excercise1IsPositive {

    
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPositive(num)) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero (neither positive nor negative).");
        }

        scanner.close();
    }
}
