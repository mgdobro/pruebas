package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingIntegerTest {

	@Test
	public void test() {
		int expected = 5;
		int[] data = { 1, 3, 6, 4, 1, 2 };

		MissingInteger mi = new MissingInteger();
		
		int actual = mi.solution(data);
		
		assertEquals(expected, actual);

	}

}
