//Array Traversal & Reversal - Max Hendrickson
// == Assignment Details: ==
// -Create an array to hold the numbers
// - Read the numbers in by using a Scanner inside of a loop
// - Stop the loop when the user enters a value of -1
// - Loop through the array backwards while printing each value
// - DO NOT print the -1 value or any unused areas of the array

import java.util.Scanner;

public class ArrayTraversal {
	public static void main(String[] args) {
		System.out.println("Enter your variables to reverse. Type '-1' to start reversal.");
		Object[] result = readNumbers();
		int[] arr = (int[]) result[0];
		int count = (int) result[1];
		System.out.println("You entered:");
		printArray(arr, count);
		reverseArray(arr, count);
		System.out.println("Reversed order:");
		printArray(arr, count);
	}

	private static Object[] readNumbers() {
		Scanner input = new Scanner(System.in);
		int[] readArr = new int[100];
		int count = 0;
		while (true) {
			int num = input.nextInt();
			if (num == -1) {
				break;
			}
			readArr[count] = num;
			count++;
		}
		return new Object[] { readArr, count };
	}

	private static void printArray(int[] arr, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	private static void reverseArray(int[] arr, int count) {
		int len = count;
		for (int i = 0; i < len / 2; i++) {
			Swap(arr, i, len - 1 - i);
		}

	}

	private static void Swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;

	}
}
