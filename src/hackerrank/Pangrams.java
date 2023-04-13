package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String s = sc.nextLine();
		
		System.out.println("answer: " + pangrams(s));
	}

	private static String pangrams(String s) {

		// 모든 알파벳이 다 쓰이면 -> pangram
		
		// 일단 소문자로 바꿈
		s = s.toLowerCase();
		// 알파벳 개수만큼의 배열 생성
		int[] freq = new int[26];
		
		// 문자열을 돌면서 알파벳의 아스키코드에 해당하는 freq배열의 인덱스에 1 추가
		for(char c : s.toCharArray()) {
			if(c >= 'a' && c <= 'z') {
				freq[c - 'a']++;
			}
		}
		// 0인 칸이 있으면 not pangram 반환
		for(int i=0; i<freq.length; i++) {
			if(freq[i] == 0) {
				return "not pangram";
			}
		}
		
		return "pangram";
	}

}
