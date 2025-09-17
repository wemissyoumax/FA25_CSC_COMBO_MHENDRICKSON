package week_5;

public class InClassLoops {
	public static void main(String[] args) {
		int sum = sumFor();
		System.out.println(sum);
		int terms = 10;
		int rows = 7;
		ForFibonacci(terms);
		rightTri(rows);
		equilTri(rows);
		}
		
	private static void equilTri(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void rightTri(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j =0; j < i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

	private static void ForFibonacci(int terms) {
		if(terms == 1) {
			System.out.println("Please use positive integers only.");
			return;
		}
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.printf("Fibonacci sequence up to %d terms\n", terms);
		if(terms == 1) {
			System.out.print(firstTerm);
			return;
		}
		System.out.print(firstTerm + ", " + secondTerm);
		for(int i = 2; i < terms; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.print(", " + nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	private static int sumFor() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum+=i;
		}
		return sum;
	}

}
