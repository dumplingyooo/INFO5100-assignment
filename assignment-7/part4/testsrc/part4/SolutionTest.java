package part4;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
	
	private Solution classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new Solution();
	}

	@Test
	void testMerge() {
		int[] result = {1,3};
		assertEquals(result, Solution.merge(null));
		//fail("Not yet implemented");
	}

}
