package hackerrank;

import java.util.Scanner;

public class ErrorDigitRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("answer: " + findRange(num));
	}

	private static long findRange(int num) {
		
		long max = num;
		long min = num;
		
		for(int i=0; i < 10; i++) {
			// int -> string (replace)
			// 0 (x)
			for(int j=0; j < 10; j++) {
				String replaced = String.valueOf(num).replace(Integer.toString(i), Integer.toString(j));
				long translated = Long.parseLong(replaced);
				
				if(replaced.charAt(0) != '0') {
					max = Math.max(max, translated);
					min = Math.min(min, translated);
				}
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		return (long)max - (long)min;
	}

}
