import java.util.Scanner;

public class BinaryConverter {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 456
		// 4 in hundreds, 5 in tens, 6 in the ones
		// 10^2, 10^1, 10^0
		
		// 10111 == 23
		//1 in the ones, 1 in the twos, 1 in the fours, 0 in the eights, 1 in sixteens (add these up)
		// 23 /2 = 11 r 1
		// 11 / 2 = 5 r 1
		// 5 / 2 = 2 r 1
		// 2 / 2 = 1 r 0
		// 1/2 = 0 r 1
		
		System.out.println("Enter the number you wish to convert: ");
		int num = input.nextInt();
		displayBin(num);

	}

	private static void displayBin(int num) {
		if(num > 0) {
			displayBin(num /2);
			System.out.print(num %2);
		}
		
	}

}
