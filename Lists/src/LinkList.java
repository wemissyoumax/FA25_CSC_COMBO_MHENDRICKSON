import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		// For an array list with integers instead of strings
		var nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		// For cars list
		cars.add("Ford");
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("Lexus");
		cars.add("Chevy");
		
		// Outputs as the collection's toString
		//System.out.println(cars);
		//.get finds the first of the array based of the int index (0)
		// System.out.println(cars.get(0));
		// Change address call of first in list
		cars.set(0, "Opel");
		 System.out.println(cars);
		// Remove last in the list
		// cars.removeLast();
		// System.out.println(cars);
		// Clear a whole list
		// cars.clear();
		// System.out.println(cars);
		System.out.println(nums);
		
		Collections.sort(cars);
		System.out.println(cars);
		/**************************************************/
		// Linked List
		LinkedList<String>animals = new LinkedList<String>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Hamster");
		animals.add("Pig");
		animals.add("Fish");
		animals.add("Snake");
		
		System.out.println(animals);
		Collections.sort(animals, Collections.reverseOrder()); // reverse sort
		System.out.println(animals);
	}

}
