package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
		// 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("List<Integer> s : " );
		String s = sc.nextLine();
		System.out.print("int k : " );
		int k = sc.nextInt();
		
		ArrayList<Character> arr = new ArrayList<Character>();
		char[] characterArray = s.toCharArray();
		for(char c : characterArray) {
			arr.add(c);
		}
		
		/*
		 * n개의 숫자가 들어있는 배열 arr, 그 중에서 k개를 뽑아서 배열 arr2를 만들어
		 * k개가 있는 배열 arr2에서 max와 min의 차이 구함
		 * 그 차이가 가장 작은 것이 답
		 */
		
		int[] array = arr.stream().mapToInt(i -> i).toArray();
		
		// 배열 정렬 (큰 값, 작은 값 구하기 쉽게)
		Arrays.sort(array);
		
		// 최소값 설정
		int minUnfairness = Integer.MAX_VALUE; 
		
		// 배열을 처음부터 (배열길이-k개+1) 만큼 돌기(연속적인 k개 선택)
		for(int i=0; i < array.length - k + 1; i++) {
			// k개 중 가장 큰 값 - 가장 작은 값
			int value = array[i + k - 1] - array[i]; 
			
			if(minUnfairness > value) {
				minUnfairness = value;
			}
		}
		
		System.out.println("minUnfairness : " + minUnfairness);
	}
}