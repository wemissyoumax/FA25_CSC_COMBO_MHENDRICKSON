package week_5;

import java.util.Scanner;

public class Doubloon {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a word and I will tell you if it's a doubloon: ");
		String word = input.next();
		word = word.toLowerCase();
		boolean isDub = isDoubloon(word);
		if (isDub) {
			System.out.println("It's a doubloon!");
		} else {
			System.out.println("No doubloons found here...");
		}

	}

	private static boolean isDoubloon(String word) {
		int len = word.length();
		for (int i = 0; i < len; i++) {
			int counter = 0;
			char letter = word.charAt(i);
			for (int j = 0; j < len; j++) {
				if (word.charAt(j) == letter) {
					counter++;
				}
			}
			if (counter != 2) {
				return false;
			}
		}

		return true;
	}

}
