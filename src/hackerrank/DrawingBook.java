package hackerrank;

public class DrawingBook {

	public static void main(String[] args) {

		int n = 5;
		int p = 3;
		
		System.out.println("pageCount: " + pageCount(n, p));
	}

	public static int pageCount(int n, int p) {

		// 앞에서부터는 항상 p/2 
		int fromFront = p/2;
		// 뒤에서부터는 p가 짝수일 때와 홀수일 때 구분
		int fromBack = 0;
		
		if(p%2 == 0) {
			fromBack = (n - p)/2;
		} else {
			fromBack = (n - p + 1)/2;
		}
		
		return Math.min(fromFront, fromBack);
	}

}
