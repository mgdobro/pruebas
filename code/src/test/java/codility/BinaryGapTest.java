package codility;

import static org.junit.Assert.*;

import org.junit.Test;

import codility.BinaryGap;

public class BinaryGapTest {

	@Test
	public void test() {
		BinaryGap bg = new BinaryGap();
		
		assertEquals(3, bg.calculate(145));
	}

}
