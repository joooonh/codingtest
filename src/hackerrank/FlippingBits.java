package hackerrank;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		long n = sc.nextLong();
		System.out.println("answer: " + flippingBits(n));
	}

	private static long flippingBits(long n) {

		// 10진수 -> 2진수 -> 32비트 남은자리에 0 -> 각 표현 뒤집음 -> 10진수 반환
		// 10진수 -> 2진수
		String binary = Long.toBinaryString(n);
		
		StringBuilder sb = new StringBuilder();
		
		// 32비트에서 2진수 길이 뺀 만큼 먼저 0을 채워줌
		for(int i=0; i < 32-binary.length(); i++) {
			sb.append('0');
		}
		// 그 다음에 2진수 채움
		sb.append(binary);
		// 0을 2로, 1을 0으로, 2를 1로 
		String flippedStr = sb.toString().replace('0', '2').replace('1', '0').replace('2', '1');
		// string -> 2진수
		return Long.parseLong(flippedStr, 2);
	}

}
