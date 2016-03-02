package code;

public class CyclicRotation {

	public int[] solution(int[] original, int i) {
		//for (; i > 0; i--) {

			
			for (int j = (1 - 1); j >= 0; j--) {                
				original[j+1] = original[j];
			}
		//}

		return original;
	}

}
