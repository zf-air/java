package list;

import java.util.ArrayList;

public class Ƕ�� {
	public static void main(String[] args) {
		ArrayList<ArrayList<String> > arrays =
				new ArrayList<ArrayList<String> >();
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hello");
		a1.add("world");
		a1.add("java");
		arrays.add(a1);
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("���Ǻ�");
		a2.add("�ŷ�");
		a2.add("�ų���");
		arrays.add(a2);
		
		//����
		for(ArrayList<String> arr:arrays) {
			for(String s:arr) {
				System.out.println(s);
			}
		}
	}
}
