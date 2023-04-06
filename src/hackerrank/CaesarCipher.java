package hackerrank;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		
		// 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("string s : " );
		String s = sc.nextLine();
		System.out.print("int k : " );
		int k = sc.nextInt();
		
		// 알파벳이 26자이고 k가 26보다 크더라도 그 안에서 돌아야 되니까 26으로 나눈 나머지가 k가 되게 함
		k = k%26;
		// 암호화된 문자열을 생성하기 위함
		StringBuilder sb = new StringBuilder();
		
		// 일단 문자열을 char 배열로 변환해서 거기서 char를 하나씩 뽑아
		for(char c : s.toCharArray()) {
			// 문자일 때만 암호화 
			if(Character.isLetter(c)) {
				// 문자 + k 만큼을 더함 -> k만큼 이동한 문자의 아스키코드값
				int ascii = c + k;
				// 근데 만약 k를 더한 이 ascii 정수값이 알파벳 문자의 범위를 넘어서면 거기서 알파벳 길이 26을 뺌 -> 알파벳 범위 내 순환
				if(Character.isLowerCase(c) && !Character.isLetter(ascii) || Character.isUpperCase(c) && !Character.isLetter(ascii)) {
					ascii -= 26;
				} 
				
				// ascii 코드값을 문자로 변환한 값을 sb 문자열에 추가
				sb.append((char)ascii);
				
			} else {
				// 문자가 아닐 때는 그냥 그대로 붙여줌 (특수문자)
				sb.append(c); 
			}
		}
		
		System.out.println("rotated : " + sb);
	}
}
