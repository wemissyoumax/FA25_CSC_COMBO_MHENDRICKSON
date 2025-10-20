
public class CharacterRoller {
	// Strength, Dexterity, Constitution, Intelligence, Wisdom, and Charisma
	// are the traits we are aiming to roll for within this roller
	
	// Dice roller method using defined variable "DICE"
	private int mod = 0;
	private int str = rollChar();
	private int dex = rollChar();
	private int con = rollChar();
	private int intl = rollChar();
	private int wis = rollChar();
	private int cha = rollChar();
	
	int[]stats = {str, dex, con, intl, wis, cha};

	public CharacterRoller() {
		super();
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intl = intl;
		this.wis = wis;
		this.cha = cha;
	}

	private int rollChar() {
		int sum = 0;
		int low = 6;
		for(int i = 0; i < 4; i ++) {
			int roll = DICE.roll(6);
			sum += roll;
			if(roll < low) {
				low = roll;
			}
		}
		sum -= low;
		return sum;
	}
	private int findMod(int stat) {
		mod =  ((stat - 10) / 2);
		return mod;
	}
	private String recType() {
		int high = 0;
		String ret = "";
		for(int i = 0; i < stats.length; i ++) {
			if(stats[i] > stats[high]) high = i;
		}
		switch(high) {
			case 0:
				ret = "Barbarian";
				break;
			case 1:
				ret = "Rogue";
				break;
			case 2:
				ret = "Paladin";
				break;
			case 3:
				ret = "Wizard";
				break;
			case 4:
				ret = "Druid";
				break;
			case 5:
				ret = "Bard";
				break;
			default:
				ret = "NPC";
		}
		return ret;
	}
	public String toString() {
		return "Character Stats [str=" + str + ", Mod [" + findMod(str) + "], dex=" + dex + ", Mod [" + findMod(dex) + 
				"], con=" + con +", Mod [" + findMod(con) +  "], intl=" + intl + ", wis=" + wis
				+ ", cha=" + cha + "]" + "\nReccomended type = " + recType();
	}

	
	
}
