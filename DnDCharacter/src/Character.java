// default constructor
public class Character {
	private int health;
	private String name;
	private int power;
	private int armor;
	private Weapon weapon;

	// Creates spot in memory for this character to live
	// Knows how big this spot is due to the defined variables we have
	
	// default constructor
	public Character() {
		super();
		this.health = 0;
		this.name = "";
		this.power = 0;
		this.armor = 0;
	}
// fields constructor
	public Character(int health, String name, int power, int armor) {
		super();
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
	}
	
	
	
	public Character(int health, String name, int power, int armor, String wName, int wDamage) {
		this.health = health;
		this.name = name;
		this.power = power;
		this.armor = armor;
		//composition - didn't actually create the driver for Weapon, send Character what it has
		this.weapon = new Weapon(wDamage, wName);
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(int damage, String name) {
		this.weapon = new Weapon(damage, name);
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	// Override the toString in this one's parent
	@Override
	public String toString() {
		return "Character [Health = " + health + ", Name = " + name + ", Power = " + power + ", Armor = " + armor + "Weapon = " + weapon]";
	}
	
	
}
