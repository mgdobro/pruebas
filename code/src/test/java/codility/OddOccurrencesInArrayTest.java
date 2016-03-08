package codility;

import static org.junit.Assert.*;

import org.junit.Test;

import codility.OddOccurrencesInArray;

public class OddOccurrencesInArrayTest {

	@Test
	public void oddAtEnd() {
		int[] original = {9,4,3,9,7,4,7};
		int expected = 3;
		
		OddOccurrencesInArray oCIA = new OddOccurrencesInArray();
		
		int actual = oCIA.solution(original);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void oddAtBegin() {
		int[] original = {3,9,9,7,9,7,9};
		int expected = 3;
		
		OddOccurrencesInArray oCIA = new OddOccurrencesInArray();
		
		int actual = oCIA.solution(original);
		
		assertEquals(expected, actual);
	}

}
