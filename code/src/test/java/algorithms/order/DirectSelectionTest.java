package algorithms.order;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectSelectionTest {

	@Test
	public void test() {
		int[] data = { 44, 55, 12, 42, 94, 18, 06, 67 };
		int[] expected = { 06, 12, 18, 42, 44, 55, 67, 94 };
		
		DirectSelection ds = new DirectSelection();
		
		int[] actual = ds.order(data);
		
		assertArrayEquals(expected, actual);
		
		
	}

}
