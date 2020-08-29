package set;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_demo {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("hello");
//		hs.add("world");
//		hs.add("java");
//		hs.add("hello");
//		
//		for(String s:hs) {
//			System.out.println(s);
//		}
		
		HashSet<Integer> ts = new HashSet<Integer>();
		ts.add(20);
		ts.add(18);
		ts.add(23);
		ts.add(22);
		ts.add(17);
		ts.add(24);
		ts.add(19);
		ts.add(18);
		ts.add(24);
		
		//×ÔÈ»ÅÅĞò
		for(int i:ts) {
			System.out.println(i);
		}
	}
}
