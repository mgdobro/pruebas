package code;

public class CyclicRotation {

	public int[] solution(int[] original, int i) {

		int[] ret = original;

		System.out.println("Initial array");

		printOut(ret);

		if (ret.length > 0) {

			for (; i > 0; i--) {

				System.out.println("i:"+ i);

				int lastValue = ret[ret.length - 1];

				for (int j = (ret.length - 1); j > 0; j--) {
					ret[j] = ret[j - 1];

				}

				ret[0] = lastValue;
				printOut(ret);
			}

			
		}

		return ret;
	}

	private void printOut(int[] array) {
		System.out.print("[");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != (array.length - 1)) {
				System.out.print(", ");
			}

		}

		System.out.println("]");

	}

}
