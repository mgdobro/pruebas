package codility;

import static org.junit.Assert.*;

import org.junit.Test;

import codility.TapeEquilibrium;

public class TapeEquilibriumTest {

	@Test
	public void sunnyDay() {
		
		int expected = 1;
		
		int[] data = {3,1,2,4,3};
		
		TapeEquilibrium te = new TapeEquilibrium();
		
		int actual = te.solution(data);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void allEquals() {
		
		int expected = 1;
		
		int[] data = {1,1,1,1,1};
		
		TapeEquilibrium te = new TapeEquilibrium();
		
		int actual = te.solution(data);
		
		
		assertEquals(expected, actual);
	}
	


}
