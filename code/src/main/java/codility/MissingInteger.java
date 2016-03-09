package codility;

public class MissingInteger {

	public int solution(int[] A) {
		int[] flag = new int[A.length];

		for (int i = 0; i < flag.length; i++) {
			int value = A[i];
			if (value > 0 && value <= A.length) {
				flag[A[i]-1]++;
			}
		}
		
		for (int i = 0; i < flag.length; i++) {
			if (flag[i] == 0) {
				return i+1;
			}
			
		}

		
		
		
		return flag.length+1;
	}

}
