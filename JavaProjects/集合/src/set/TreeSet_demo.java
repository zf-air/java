package set;

import java.util.TreeSet;

public class TreeSet_demo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
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
