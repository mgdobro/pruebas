package code;

public class TapeEquilibrium {

	public int solution(int[] A) {

		int ret = 0;

		for (int p = 1; p < A.length; p++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int i = 0; i < A.length; i++) {
				if (i < p) {
					leftSum += A[i];
				} else {
					rightSum += A[i];
				}
			}

			int value = Math.abs(leftSum - rightSum);


			if (  p == 1 || value < ret) {
				ret = value;

			}

		}

		return ret;
	}

}
