package programmers;

import java.util.Arrays;

public class Emergency {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		
		System.out.println("answer: " + Arrays.toString(solution(emergency)));

	}

	private static int[] solution(int[] emergency) {
		
		// 복사해서 정렬하는 배열
		int[] copy = Arrays.copyOf(emergency, emergency.length);
		// 순서 담는 정답 배열
		int[] answer = new int[emergency.length];
		// copy 배열 정렬 (근데 숫자 클수록 우선순위 = 1)
		Arrays.sort(copy);
		
		// for문 돌면서 emer배열 i번째 = copy배열 j번째이면 -> result[i] = length-j
		for(int i=0; i < emergency.length; i++) {
			for(int j=0; j < emergency.length; j++) {
				if(emergency[i] == copy[j]) {			 
					answer[i] = emergency.length - j;
				}
			}
		}
		
		return answer;
	}

}