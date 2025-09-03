import java.util.Scanner;

public class Input_Play {

	public static Scanner input = new Scanner(System.in);// static means everything use this object instead of having their own
	  // private is the access, static means it's outside of main
	  // void is the return type for returning nothing
		//printInput is the name and there are no params
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");// String literal, ctrl+space to shortcut output
		String name = input.next();
		System.out.println("Great " + name + "!");
		System.out.println("Enter you age in years");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
		
		// For lab 1 coming up- Temperature Conversion
		System.out.println("What is the temperature in Farenheidt?");
		double fTemp = input.nextDouble(); // input for a floating point number (double)
		double cTemp = convertToC(fTemp); // Pulls from public static double after main
		double kTemp = convertToK(cTemp); // calling a method that returns a double and takes a double as a param
		System.out.println(fTemp + "°F is " + cTemp + "°C and " + kTemp + "°K");
		System.out.printf("%.2f°F is %.2f°C is %.2f°K%n", fTemp, cTemp, kTemp); // Rounds outputs and displays them as "34.56°F" for example
		// %n after ° creates new line, spacing caused °K output issue

		// Convert kilos to pounds
		System.out.println("Enter kilos:");
		double kilos = input.nextDouble();
		double pounds = convertToPounds(kilos);
		System.out.printf("%.2f",pounds);
	}
 private static double convertToPounds (double kilos) {
	 return kilos * 2.2;
 }
	// public lets everyone use this
	// double is the data type of what is returned
	// double fTemp is the variable used inside this parameter/argument
public static double convertToC(double fTemp){
	return (fTemp - 32) * 5/9;
}
public static double convertToK (double cTemp){
	return cTemp + 273.15;
}

}
