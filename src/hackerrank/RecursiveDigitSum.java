package hackerrank;

public class RecursiveDigitSum {

	public static void main(String[] args) {

		String n = "148";
		int k = 3;
		
		System.out.println("superDigit: " + superDigit(n, k));
	}

	public static int superDigit(String n, int k) {

		// 문자열의 길이가 1이면 그 값 반환
		if(n.length() == 1) {
			return Integer.parseInt(n);
		}
		
		// 문자열의 길이만큼 돌면서 각 자리수의 합 구하기
		// "148" -> 1 + 4 + 8
		long sum = 0;						// 숫자가 커질 수도 있으니까 long으로 받음
		for(int i=0; i<n.length(); i++) {
			sum += n.charAt(i) - '0';		// '1' -> 1
		}
		
		// ( 1 + 4 + 3 ) * k -> 문자열 변환
		String newN = Long.toString(sum*k);
		
		// 재귀함수, 앞으로는 문자열 1번만 반복하니까 k=1
		return superDigit(newN, 1);
		
	}

}
