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
		
		//���µ� ��ɾ��֮ǰ�� �����µļ���
		for(String s:set) {
			System.out.println(s);
		}
		/*world
		java
		hello*/
	}
}
