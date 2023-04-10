package hackerrank;

public class PalindromeIndex {

	public static void main(String[] args) {

		String s = "aaab";
		
		System.out.println("answer: " + palindromeIndex(s));
	}

	private static int palindromeIndex(String s) {
		
		int len = s.length(); 
		int start = 0; 
		int end = s.length() - 1; 
		
		
		// 양쪽 끝에서부터 만날 때까지 회문인지 확인
		while (start < end) {
			if(s.charAt(start) != s.charAt(end)) 
				break;
			start ++;
			end --; 
		}
		// 만날 때까지 다른 문자 없으면 회문 -> -1 반환
		if(start >= end) 
			return -1;
		
		// 문자열이 회문이 아닐 때 
		// 반환할 인덱스 구하기
		int i = start; 
		int j = end;
		
		// 전체 string이 회문 아닌건 알았으니까 첫번째 문자 제외
		start ++;
		
		// 회문인지 확인
		while(start < end) {
			if(s.charAt(start) != s.charAt(end))
				return j;
			start ++; 
			end --;
		}
		
		// 회문이면 현재 제외한 i번째 인덱스 반환
		return i;

	}	

}
