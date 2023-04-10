package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		
		System.out.println("getTotalX : " + getTotalX(a, b)); 
	}

	private static int getTotalX(List<Integer> a, List<Integer> b) {
		
		// a배열의 최소공배수
		int aLCD = a.get(0);
		for(int i=1; i < a.size(); i++) {
			aLCD = LCD(aLCD, a.get(i));
		}
		
		// b배열의 최대공약수
		int bGCD = b.get(0);
		for(int i=1; i < b.size(); i++) {
			bGCD = GCD(bGCD, b.get(i));
		}
		
		// a배열의 최소공배수의 배수이면서 b배열의 최대공약수의 약수
		int answer = 0;
		for(int i=1; i<=100; i++) {
			if(i % aLCD == 0 && bGCD % i == 0)
				answer ++;
		}
		
		return answer;
	}
	
	// 최대공약수
	public static int GCD(int num1, int num2) {
		if(num1 % num2 == 0) {
			return num2;
		}
		return GCD(num2, num1%num2);
	}
	
	// 최소공배수
	public static int LCD(int num1, int num2) {
		return num1 * num2 / GCD(num1, num2);
	}

}

