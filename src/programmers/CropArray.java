package programmers;

import java.util.Arrays;

public class CropArray {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		System.out.println("answer: " + Arrays.toString(solution(numbers, num1, num2)));
	}

	private static int[] solution(int[] numbers, int num1, int num2) {

		int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		return answer;
	}

}
