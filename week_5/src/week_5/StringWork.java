package week_5;

import java.util.Scanner;

public class StringWork {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String word = "bananas";
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		// Substrings splice parts from an existing string to mess with, 
		// doesn't change how the base String is presented
		// aka String = "bananas" still.
		System.out.println("" + word.charAt(5) + word.charAt(6) + " is the " + (word.indexOf("n", 3) + 1) + " letter");
		System.out.println(word.substring(0, 3));
		System.out.println(word.substring(3, 6));
		System.out.println(word.substring(0,3) + "d" + word.substring(3));
		
		String reversed = reverse(word);
		System.out.println(reversed);
		
		System.out.println("Shall we go?");
		String answer = input.nextLine();
		// converts inputs to lowercase to keep loop and output intact
		answer = answer.toLowerCase();
		
		if(answer.equals("yes")){
			System.out.println("Let's go!");
		}else {
			System.out.println("Wha, wha whaaaaaa...");
		}
		
		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";
		// If name1 comes before name2, you get a negative number back
		int diff = name1.compareTo(name2);
		//compare to doesn't 
		if(diff <0) {
			System.out.println(name1 + " comes before " + name2);
		}else if(diff > 0) {
			System.out.println(name2 + " comes before " + name1);
		}else {
			System.out.println("The names are the same.");
		}
		System.out.println("Enter the hour: ");
		int hour = input.nextInt();
		System.out.println("Enter the minute: ");
		int min = input.nextInt();
		
		String time = timeString(hour, min);
	}

	private static String timeString(int hour, int min) {
		String ampm;
		if(hour < 12) {
			ampm = "AM";
			if(hour == 0) {
				hour = 12;
			}
		}else {
			ampm = "PM";
			hour = hour - 12;
		}
		// this tells us to take up two spaces or take up 1 if it takes up 1
		// instead -- so no "01:12 PM"
		return String.format("%02d:%02d %s", hour, min, ampm);
	}

	private static String reverse(String word) {
		
		return null;
	}
}
