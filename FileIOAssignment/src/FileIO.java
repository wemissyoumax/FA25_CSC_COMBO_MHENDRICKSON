import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

    public static void main(String[] args) {
        double subtotal = 0.0;
        final double TAX_RATE = 0.053; 

        try {
            File inputFile = new File("items.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextDouble()) {
                subtotal += scanner.nextDouble();
            }

            scanner.close();

            double tax = subtotal * TAX_RATE;
            double finalTotal = subtotal + tax;

            FileWriter writer = new FileWriter("total.txt");

            writer.write(String.format("Subtotal: %.2f\n", subtotal));
            writer.write(String.format("Sales Tax (5.3%%): %.2f\n", tax));
            writer.write(String.format("Final Total: %.2f\n", finalTotal));

            writer.close();

            System.out.println("Totals written to total.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
