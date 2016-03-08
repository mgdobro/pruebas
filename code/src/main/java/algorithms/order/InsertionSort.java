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
			int nextValue = 0;
			boolean flag = false;
			for (int j = 0; j < i - 1; j++) {

				if (!flag) {
					if (value < ret[j]) {
						nextValue = ret[j];
						ret[j] = value;
						flag = true;
					}
				} else {
					int tmp = ret[j];
					ret[j]=nextValue;
					nextValue=ret[j+1];
				}

			}

		}

		return ret;
	}

}
