import java.util.Scanner;

public class Decisions {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// x == y -> does x equal y?
		// x != y -> is x not equal to y?
		// x > y -> is x greater than y?
		// x < y -> is x less than y?
		// x >= y -> is x greater than or equal to y?
		// x <= y
		
		int x = 0;
		
		if(x % 2 == 0) {
			System.out.println("x is even");
		}else {
			System.out.println("x is odd");
		}
		
		if(x > 0) {
			System.out.println("x is positive");
		}
		else if(x > 0) {
			System.out.println("x is negative");
		}else {
			System.out.println("x is 0");
		}
		
		System.out.println("Enter a number from 1 to 4");
		int num = input.nextInt();
		if (num == 1){
			System.out.println("one");
		}else if (num == 2){
			System.out.println("two");
		}else if (num == 3) {
		System.out.println("three");
		}else {
		System.out.println("four");
	}
	
	switch (num) {
	case 1: 
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
	}
	
	String food = "broccoli";
	
	switch (food) {
	case "apple":
	case "banana":
	case "cherry":
		System.out.println("Fruit!");
		break;
	case "broccoli":
	case "carrot":
	case "peas":
		System.out.println("Veggie!");
		break;
	}
	
	// if (x > 0 && x < 10); //numbers 1-9
	// x < 0 || x > 10 -> less than zero or greater than 10, not 1-9
	// !(x > 0) any negative number
	x = 4;
	int y = 0;
	
	if(x == 0) {
		if(y ==0) {
			System.out.println("Both x and y are zero");
		}
	}
	if(x == 0 && y == 0) System.out.println("Both are zero");
	if(x == 0 || y == 0) System.out.println("Either x or y is zero");
	
	//!(a && b) is the same as !a || !b 
	//!(a || b) is the same as !a && !b
	
	boolean flag;
	flag = true;
	
	System.out.println(isSingleDigit(0));
	int userNum = input.nextInt();
	if(!isSingleDigit(userNum)) {
		System.out.println("That is not a single digit");
	}
	}
	private static int getNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	public static boolean isSingleDigit(int num) {
		return num > -10 && num < 10;
	}

}
