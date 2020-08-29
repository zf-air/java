package Map;

import java.util.Arrays;
import java.util.Collections;

public class lianxi {
	public static void main(String[] args) {
		int[] arr = {1,2,5,3,4};

		StringBuilder sb = new StringBuilder();
		for(int i:arr) {
			sb.append(i);
		}
		sb.reverse();
		String s = sb.toString();
		
		for(int i=0;i<s.length();i++) {
			arr[i] = s.charAt(i)-'0';
		}
		s = Arrays.toString(arr);
		System.out.println(s);
	}
}
