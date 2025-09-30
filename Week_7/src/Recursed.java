import java.util.Scanner;

public class Recursed {
	public static void main(String[] args) {
		static Scanner input = new Scanner(System.in);
		int n = 10;
		countdown(n);
		int factN = factorial(n);
		System.out.println(factN);
		for (int i = 0; i < n; i++) {
			System.out.println(factorial(i));
		}
		int fibNum = fibonacci(n);
		String another = "y";
		while(another.equals("y")) {
			System.out.println("Enter the fib level you want to go to");
			fibNum = input.nextInt();
			for (int i =0; i < fibNUm; i++) {
				System.out.print(fibonacci(i) + ", ");
				if(i % 7 == 0)System.out.println();
			}
			System.out.println("Again?");
			another = input.next();
		}
	}

	private static int fibonacci(int n) {
		if(n < 1) {
			System.out.println("Please use positive integers only!");
			return 0;
		}
		if(n ==1 || n ==2)return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	private static int factorial(int n) {
		if(n == 0) return 1; // base case is when looping stops
		int recurse = factorial(n-1);
		int result = n * recurse;
		return result;
	}

	private static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blast off!");
		} else {
			System.out.println(n);
			countdown(n-1);
		}
		
	}

}
