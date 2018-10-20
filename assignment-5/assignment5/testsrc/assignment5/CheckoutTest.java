package assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	
	private Checkout classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Checkout();
	}

	@Test
	public void testTotalCost() {
		int result1 = 1331;
		assertEquals(result1, classUnderTest.totalCost());
	}

	@Test
	public void testTotalTax() {
		int result2 = 27;
		assertEquals(result2, classUnderTest.totalTax());
	}

	@Test
	public void testClear() {
		int result3 = 0;
		assertEquals(result3, classUnderTest.numberOfItems());
	}

}
