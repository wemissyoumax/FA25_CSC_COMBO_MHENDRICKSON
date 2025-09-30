import java.util.Random;

public class Histogram {

	public static void main(String[] args) {

		int[] arr = new int[10];
		fillArray(arr);
		int sixties = 0;
		int seventies = 0;
		int eighties = 0;
		int nineties = 0;
		for(int num : arr) {
			if(num > 89) nineties++;
			else if(num > 79) eighties++;
			else if(num > 69) seventies++;
			else sixties++;
		}
		System.out.printf("90s    80s    70s    60s\n%d    %d    %d    %d", nineties, eighties, seventies, sixties); 

	}

	private static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(40)+60;
		}
		
	}

}
