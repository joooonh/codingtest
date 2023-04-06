package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

	public static void main(String[] args) {
		
		List<String> grid = new ArrayList<String>();
		grid.add("ebacd");
		grid.add("fghij");
		grid.add("olmkn");
		grid.add("trpqs");
		grid.add("xywuv");
		
		// 배열의 각 요소(문자열) 정렬
		for(int i=0; i<grid.size(); i++) {
			String str = grid.get(i);		// "ebacd"
			char[] c = str.toCharArray();	// [ebacd]
			Arrays.sort(c);					// [abcde]
			str = new String(c);			// "abcde"
			grid.set(i, str);				// grid에 다시 담아줌
		}
		
		// 각 열의 크기 정렬
		for(int i=0; i<grid.get(0).length(); i++) {						// 첫 행의 열의 길이만큼
			for(int j=0; j<grid.size()-1; j++) {
				if(grid.get(j).charAt(i) > grid.get(j+1).charAt(i)) {	// 이전 행의 값이 더 크면
					System.out.println("NO");							// NO 반환
				}
			}
		}
		System.out.println("YES");
		
		
	}
}
