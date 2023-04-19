package hackerrank;

import java.util.Scanner;

public class EliminateSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("answer: " + getFinalString(s));
	}

	private static String getFinalString(String s) {

		// 주어진 대문자 문자열 s에서 "AWS"가 없을 때까지 계속 지우기
		StringBuilder sb = new StringBuilder(s);
		
		while(sb.indexOf("AWS") != -1) {
			sb.delete(sb.indexOf("AWS"), sb.indexOf("AWS") + "AWS".length());
		}
		if(sb.length() == 0) return "-1";
		
		return sb.toString();
	}

}
