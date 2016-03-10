package algorithms.order;

/**
 * @author
 * 
 * 		Based on https://en.wikipedia.org/wiki/Insertion_sort
 *
 */
public class DirectSelection {

	public int[] order(int[] data) {
		int[] ret = data;


		for (int i = 0; i < ret.length; i++) {
			System.out.print("iteration: " + i + " -- ");
			for (int j = 0; j < ret.length; j++) {
				System.out.print(ret[j] + " ");
			}
			System.out.println();
			
			int minValue = ret[i];
			int minPosition = i;
			
			for (int j = i ; j < ret.length; j++) {
				if ((int) ret[j] < minValue) {
					minPosition = j;
					minValue = ret[j];
				}
				
			}
			ret[minPosition] = ret[i];
			ret[i] = minValue;

		}

		System.out.print("Final result: " + " -- ");
		for (int j = 0; j < ret.length; j++) {
			System.out.print(ret[j] + " ");
		}
		System.out.println();

		return ret;
	}

}
