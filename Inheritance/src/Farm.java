
public class Farm {
	public static void main(String[] args) {
		Animal[] farm = new Animal[3];
		farm[0] = new Animal (24, 66, "Jasper");
		farm[1]= new Dog(71, 69, "Fido", "German Shepherd", "Tan - Black");
		farm[2] = new Cat(40, 26, "Fluffy", true, false);
		for(Animal ani : farm) {
			System.out.println(ani);
			System.out.println(ani.makeNoise());
			System.out.println();
		}
		
//		System.out.println(ani);
//		System.out.println();
//		System.out.println(dog);
//		System.out.println(dog.makeNoise());
//		System.out.println();
//		System.out.println(cat);
//		System.out.println(cat.makeNoise());
	}
}
