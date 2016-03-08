package codility;

public class OddOccurrencesInArray {

	public int solution(int[] original) {

		int unpaired = 0;
		for (int number : original) {
			unpaired ^= number;
		}
		return unpaired;
	}

}
