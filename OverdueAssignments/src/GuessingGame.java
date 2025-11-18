import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the maximum number for the range (starting at 1): ");
        int max = input.nextInt();
        int secret = rand.nextInt(max) + 1;

        int guess = 0;
        int numTries = 0;
        while (guess != secret) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            numTries++;

            if (guess < secret) {
                System.out.println("Higher");
            } else if (guess > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("You got it in " + numTries + " tries.");
            }
        }

        input.close();
    }
}
