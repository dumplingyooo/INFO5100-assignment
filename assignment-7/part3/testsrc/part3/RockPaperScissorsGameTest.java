package part3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {
	private RockPaperScissorsGame classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new RockPaperScissorsGame();
	}

	@Test
	public void testMain() {
		boolean result;
		assertEquals(result, classUnderTest.s.fight(p));
		fail("Not yet implemented");
	}

}
