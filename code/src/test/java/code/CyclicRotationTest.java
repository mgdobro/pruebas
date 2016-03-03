package code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void test() {
		int[] original = { 1, 2, 3, 4, 5 };
		int[] expected = { 3, 4, 5, 1, 2 };

		CyclicRotation cr = new CyclicRotation();
		
		int[] actual = cr.solution(original, 3);

		assertEquals(expected, actual);
	}
	
	@Test
	public void emptyArray() {
		int[] original = { };
		int[] expected = { };

		CyclicRotation cr = new CyclicRotation();

		assertEquals(expected.length, cr.solution(original, 3).length);
	}
}
