import java.util.Scanner;

public class Exercise4 {
    public static String getWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1–7): ");
        int num = scanner.nextInt();

        String day = getWeekDay(num);

        if (day.equals("Invalid")) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            System.out.println("The day is: " + day);
        }

        scanner.close();
    }
}
