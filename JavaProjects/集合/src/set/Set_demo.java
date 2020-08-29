package set;

import java.util.HashSet;
import java.util.Set;

public class Set_demo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("hello");
		
		//有新的 会删除之前的 并把新的加入
		for(String s:set) {
			System.out.println(s);
		}
		/*world
		java
		hello*/
	}
}
