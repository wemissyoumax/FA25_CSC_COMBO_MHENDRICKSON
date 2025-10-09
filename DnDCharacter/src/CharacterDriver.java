import java.util.Scanner;

public class CharacterDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your character's name?");
		String name = input.next();
		System.out.println("How many Hit Points?");
		int hp = input.nextInt();
		System.out.println("How much power?");
		int power = input.nextInt();
		System.out.println("What is their armor class?");
		int ac = input.nextInt();
		
		Character bob = new Character(hp, name, power, ac);
		Character monster = new Character();
		
		monster.setName("Buggaboo");
		monster.setPower(40);
		monster.setHealth(80);
		monster.setArmor(20);
		
		System.out.println(bob.toString());
		System.out.println("\n" + monster);
		System.out.println();
		Weapon ax = new Weapon(28, "Ax");
		System.out.println(ax);
		bob.setWeapon(35, "Long_Sword");
		monster.setWeapon(25, "Claws");
		System.out.println(bob.toString());
		System.out.println(monster.toString());
		
		Character harpy = new Character(100, "Harpy", 75, 25, "Talons", 35)

	}

}
