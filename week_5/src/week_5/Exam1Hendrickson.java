package week_5;

import java.util.Scanner;

public class Exam1Hendrickson {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//2. MessagePrinter
		System.out.println("This is my first programing test.");
		
		//3. BeverageSelector
		int water = 1;
		int coke = 2;
		int coffee = 3;
		System.out.println("What beverage would you like? Enter the number for your selection.");
		System.out.println("1. Water|2. Coke|3. Coffee");
		double beverage = input.nextInt();
		if(beverage == 1) {
			System.out.println("You have selected: Water");
		}else if(beverage == 2) {
			System.out.println("You have selected; Coke");
		}else if(beverage == coffee){
			System.out.println("You have selected: Coffee");
		}else {
			
		}
		
		//4. Divider
		System.out.println("Enter two numbers to be divided: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("Your answer is " + (num1/num2) + " when you divide: " + num1 +  " & " + num2);
		
		//5. Accumulator
		System.out.println("Enter numbers to be added. Enter '0' to start summation.");
		int userIn = input.nextInt();
		int stop = 0;
		while(userIn > stop) {
			int userSum = (userIn + userIn);
		} if(userIn == stop) {
			System.out.println("Your numbers added together all equal: ");	
		}
	}

}
