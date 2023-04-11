package hackerrank;

import java.util.Scanner;

public class XORStrings2 {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        System.out.println(strings_xor(s, t));
        sc.close();
    }
    
    public static String strings_xor(String s, String t) {
        
    	String answer = "";
    	
    	for(int i=0; i < s.length(); i++) {
    		if(s.charAt(i) != t.charAt(i)) {
    			answer += 1;
    		} else {
    			answer += 0;
    		}
    	}
    	
    	return answer;
    }

}
