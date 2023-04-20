package programmers;

import java.util.Scanner;

public class AgeOfAlienPlanet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		System.out.println("answer : " + solution(age));
		sc.close();
	}

	private static String solution(int age) {
		
		String s = "";
		while(age != 0) {
			int num = age % 10;
			s += (char)(num + 97);
			age /= 10;
		}
		
		return s;
	}

}
