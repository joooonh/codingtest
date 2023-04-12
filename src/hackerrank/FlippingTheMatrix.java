package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlippingTheMatrix {

	public static void main(String[] args) {

		List<List<Integer>> matrix = new ArrayList<>();
		
		matrix.add(Arrays.asList(112, 42, 83, 119));
		matrix.add(Arrays.asList(56, 125, 56, 49));
		matrix.add(Arrays.asList(15, 78, 101, 43));
		matrix.add(Arrays.asList(62, 98, 114, 108));
		
		System.out.println("answer: " + flippingMatrix(matrix));

	}

	private static int flippingMatrix(List<List<Integer>> matrix) {
		
		int size = matrix.size();
		int sum = 0;
		
		for(int r=0; r < size; r++) {
			for(int c=0; c < size; c++) {
				
				int p1 = matrix.get(r).get(c);
				int p2 = matrix.get(size-r-1).get(c);
				int p3 = matrix.get(r).get(size-c-1);
				int p4 = matrix.get(size-r-1).get(size-c-1);
				
				sum += Math.max(p1, Math.max(p2, Math.max(p3, p4)));
			}
		}
		
		return sum;
	}

}
