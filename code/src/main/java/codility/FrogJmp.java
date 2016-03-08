package codility;

public class FrogJmp {

	public int solution(int x, int y, int d) {

		int diff = y-x;
		
		

		return (diff / d) + ((diff % d ==  0) ? 0:1);
	}

}
