import java.util.Scanner;

public class Exercise2GreatestNumber {


    public static int greatestNumber(int a, int b, int c) {
        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }

        return greatest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int result = greatestNumber(num1, num2, num3);
        System.out.println("The greatest number is: " + result);
        
        scanner.close();
    }
}

