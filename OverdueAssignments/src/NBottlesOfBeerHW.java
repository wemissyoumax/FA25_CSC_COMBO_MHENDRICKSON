
import java.util.Scanner;

public class NBottlesOfBeerHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bottles to start with: ");
        int startBottles = scanner.nextInt();
        int bottles = startBottles;

        while (bottles > 0) {
            if (bottles > 1) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (bottles - 1) + 
                                   ((bottles - 1 == 1) ? " bottle" : " bottles") + " of beer on the wall.\n");
            } else {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down and pass it around, 0 bottles of beer on the wall.\n");
            }
            bottles--;
        }

        System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
        System.out.println("Go to the store and buy some more, " + startBottles + 
                           ((startBottles == 1) ? " bottle" : " bottles") + " of beer on the wall.");
        
        scanner.close();
    }
}

