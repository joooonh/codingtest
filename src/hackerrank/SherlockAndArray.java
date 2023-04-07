package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndArray {

	public static void main(String[] args) {
		// 입력값
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(11);
		
		// 배열로 변환
		int[] arr = list.stream().mapToInt(i -> i).toArray();
		
		// 배열 전체 합계
		int totalSum = Arrays.stream(arr).sum();
		
		// 변수 초기화
		int rightSum = totalSum;	// 오른쪽 합계 = 전체 합계로 초기 설정
		int leftSum = 0;			// 왼쪽 합계
		String answer = "";
		
		// 오른쪽 합계, 왼쪽 합계 구하기 
		for(int i=0; i < arr.length; i++) {
			// 오른쪽 합계 = 전체 합계 - i번째까지의 값
			rightSum -= arr[i];
			// 왼쪽 합계 = 첫번째부터 i-1까지의 합
			leftSum = (i == 0) ? 0 : leftSum + arr[i - 1]; 
			
			// 오른쪽 합계와 왼쪽 합계가 같으면 YES 담고 종료 
			if(rightSum == leftSum) {
				answer = "YES"; 
				break;
			} else {
				answer = "NO";
			}
		}
		
		System.out.println(answer);

	}

}
