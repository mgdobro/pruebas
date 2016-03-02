package code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void test() {
		int[] original = { 3, 8, 9, 7, 6 };
		int[] expected = { 9, 7, 6, 3, 8 };

		CyclicRotation cr = new CyclicRotation();

		assertEquals(expected, cr.solution(original, 3));
	}
}
