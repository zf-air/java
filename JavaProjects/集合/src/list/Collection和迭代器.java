package list;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionºÍµü´úÆ÷ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");

//		Iterator it = c.iterator();
//		while (it.hasNext()) {
//			String s = (String) it.next();
//			System.out.println(s);
//		}
		
		Object[] obj = c.toArray();
		for(int i=0;i<obj.length;i++) {
			String s = (String)obj[i];
			System.out.println(s);
		}
	}

}
