package UnitTests;

import static org.junit.jupiter.api.Assertions.*;
import Code.Character;
import org.junit.jupiter.api.Test;

class armorTest {

	@Test
	void test() {
		Character character = new Character (78, "Aragoth the Destroyer", 85, 12);
		int armor = character.getArmor();
		assertEquals(12, armor); 
	}

}
