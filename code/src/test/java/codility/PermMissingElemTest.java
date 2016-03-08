package codility;

import static org.junit.Assert.*;

import org.junit.Test;

import codility.PermMissingElem;

public class PermMissingElemTest {

	@Test
	public void sunnyDay() {
		int [] data = {2,3,1,5};
		int expected = 4;
		
		PermMissingElem pme = new PermMissingElem();
		
		int actual = pme.solution(data);
		
		assertEquals(expected, actual);
		

	}
	
	@Test
	public void empty() {
		int [] data = {};
		int expected = 1;
		
		PermMissingElem pme = new PermMissingElem();
		
		int actual = pme.solution(data);
		
		assertEquals(expected, actual);
		

	}
	

	
	
	
	@Test
	public void missingFirst() {
		int [] data = {5,3,4,2};
		int expected = 1;
		
		PermMissingElem pme = new PermMissingElem();
		
		int actual = pme.solution(data);
		
		assertEquals(expected, actual);
		

	}	


}
