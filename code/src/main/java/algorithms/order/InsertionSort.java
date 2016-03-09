package algorithms.order;

/**
 * @author 
 * 
 *         Based on https://en.wikipedia.org/wiki/Insertion_sort
 *
 */
public class InsertionSort {

	public int[] order(int[] data) {
		int[] ret = data;

		for (int i = 1; i < ret.length; i++) {
			System.out.print("iteration: " + i + " -- ");
			for (int j = 0; j < ret.length; j++) {
				System.out.print(ret[j] + " ");
			}
			System.out.println();

			int value = ret[i];
			
			for (int j = i-1; j >= 0 && ret[j] > value; j--) {
				int tmp = ret[j];
				ret[j] = value;
				ret[j+1] = tmp;
			}

		}

		return ret;
	}

}
