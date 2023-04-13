package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

	public static void main(String[] args) {

		List<Integer> A = new ArrayList<Integer>();
		A.add(2);
		A.add(1);
		A.add(3);
		List<Integer> B = new ArrayList<Integer>();
		B.add(7);
		B.add(8);
		B.add(9);
		
		int k = 10;
		
		System.out.println("answer: " + twoArrays(k, A, B));
	}

	private static String twoArrays(int k, List<Integer> a, List<Integer> b) {

		// A[i] + B[i] >= k 가 되게 하는 조합이 있는지
		// 하나는 오름차순, 하나는 내림차순 정렬한 뒤 for문 돌면서 i번째의 합 >= k
		
		Collections.sort(a);
		Collections.sort(b, Collections.reverseOrder());
		
		for(int i=0; i < a.size(); i++) {
			if(a.get(i) + b.get(i) < k) {
				return "NO";
			}
		}
		
		return "YES";
	}

}
