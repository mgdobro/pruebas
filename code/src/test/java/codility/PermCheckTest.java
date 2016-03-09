package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void permutationOk() {
		int expected = 1;
		int[] data = { 4, 1, 3, 2 };
		PermCheck pc = new PermCheck();

		int actual = pc.solution(data);

		assertEquals(expected, actual);
	}

	@Test
	public void permutationNotOk() {
		int expected = 0;
		int[] data = { 5, 1, 3, 2 };
		PermCheck pc = new PermCheck();
		
		int actual = pc.solution(data);

		assertEquals(expected, actual);
	}

}
