package list;

import java.util.Iterator;
import java.util.Vector;

public class 泛型 {
	public static void main(String[] args) {

		// 加上类型
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("world");
		v.add("java");

		for (String s : v) {
			System.out.println(s);
		}

		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
