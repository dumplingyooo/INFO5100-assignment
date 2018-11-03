package part5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class solutionTest {
	
	private solution classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new solution();
	}

	@Test
	void testFindMedianSortedArrays() {
		double result = 2.0;
		assertEquals(result, classUnderTest.findMedianSortedArrays(null,null));
	}
}
