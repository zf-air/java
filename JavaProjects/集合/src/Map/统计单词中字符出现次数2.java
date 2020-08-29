package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class 统计单词中字符出现次数2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("please input:");
		String s = in.nextLine();

		System.out.println("s:"+s);
		TreeMap<Character, Integer> map = 
					new TreeMap<Character,Integer>();
		char[] chs = s.toCharArray();
		for (char ch : chs) {			
			if (!map.containsKey(ch))
				map.put(ch, 1);
			else {
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			}
		}

		StringBuilder sb = new StringBuilder();
		Set<Character> set = map.keySet();
		for (char key : set) {
			int value = map.get(key);
			sb.append("[");
			sb.append(key);
			sb.append(":");
			sb.append(value);
			sb.append("]");
		}
		String res = sb.toString();
		System.out.println(res);
	}
}
