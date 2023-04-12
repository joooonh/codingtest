package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(5);
		arr.add(3);
		
		System.out.println("answer : " + findMedian(arr));

	}

	private static int findMedian(List<Integer> arr) {
		
		// ArrayList 정렬
		Collections.sort(arr);
		
		// 가운데 값 구하기
		return arr.get(arr.size()/2);
		
	}

}
