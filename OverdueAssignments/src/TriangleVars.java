

import java.util.Scanner;

public class TriangleVars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char repeat;

        do {
            int size = 0;
            while (true) {
                System.out.print("Enter size: ");
                size = in.nextInt();
                if (size >= 1 && size <= 50) {
                    break;
                } else {
                    System.out.println("Size must be between 1-50!");
                }
            }

            System.out.print("Enter fill: ");
            char fill = in.next().charAt(0);

            for (int row = 1; row <= size; row++) {
                for (int space = size - row; space > 0; space--) {
                    System.out.print(" ");
                }

                for (int col = 1; col <= row; col++) {
                    System.out.print(fill + " ");
                }
                System.out.println();
            }

            System.out.print("Would you like another triangle (Y/N)?\n: ");
            repeat = in.next().toUpperCase().charAt(0);

        } while (repeat == 'Y');

        in.close();
    }
}
