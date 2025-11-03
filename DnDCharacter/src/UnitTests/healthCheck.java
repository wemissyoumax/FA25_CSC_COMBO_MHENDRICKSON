package UnitTests;

import static org.junit.Assert.*;
import Code.Character;
import org.junit.Test;

public class healthCheck {

	@Test
	public void test() {
		Character chara = new Character (78, "Larry", 80, 12);
		int health = chara.getHealth();
		assertEquals(78, health);
	}
}
