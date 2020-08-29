package list;

import java.util.ArrayList;

public class Ç¶Ì× {
	public static void main(String[] args) {
		ArrayList<ArrayList<String> > arrays =
				new ArrayList<ArrayList<String> >();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hello");
		a1.add("world");
		a1.add("java");
		arrays.add(a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("ÕÅĞÇºÅ");
		a2.add("ÕÅ·«");
		a2.add("ÕÅ³¿Óî");
		arrays.add(a2);
		
		//±éÀú
		for(ArrayList<String> arr:arrays) {
			for(String s:arr) {
				System.out.println(s);
			}
		}
	}
}
