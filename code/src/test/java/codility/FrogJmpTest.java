package codility;

import static org.junit.Assert.*;

import org.junit.Test;

import codility.FrogJmp;

public class FrogJmpTest {

	@Test
	public void sunnyDay() {
		int expected = 3;
		int x = 10;
		int y = 85;
		int d = 30;
		
		FrogJmp fj = new FrogJmp();
		int actual = fj.solution(x, y, d);
		
		assertEquals(expected, actual);
	}
	
	
	
	
	
	@Test
	public void codility() {
		int expected = 2;
		int x = 1;
		int y = 5;
		int d = 2;
		
		FrogJmp fj = new FrogJmp();
		int actual = fj.solution(x, y, d);
		
		assertEquals(expected, actual);
	}

}
