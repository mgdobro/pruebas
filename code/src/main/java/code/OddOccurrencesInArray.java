package code;

public class OddOccurrencesInArray {

	public int solution(int[] original) {

		int oddNumber = 0;
		for (int i = 0; i < original.length; i++) {
			if (original[i] > 0) {
				oddNumber = original[i];
				for (int j = i + 1; j < original.length; j++) {
					if (oddNumber == original[j]) {
						original[i] = 0;
						original[j] = 0;
						break;
					}

				}
				if (original[i] != 0) {
					return oddNumber;
				}
			}
		}

		return oddNumber;
	}

}
