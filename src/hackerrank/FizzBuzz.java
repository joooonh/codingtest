package hackerrank;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fizzBuzz(n);
	}

	private static void fizzBuzz(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0 && i % 3 != 0) {
				System.out.println("Buzz");
			} else if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
