package code;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOneTest {

	@Test
	public void test() {
		int expected = 6;
		int[] data = {1,3,1,4,2,3,5,4};
		
		FrogRiverOne fro = new FrogRiverOne();
		
		int actual = fro.solution(5, data);
		
		assertEquals(expected, actual);
	}

}
