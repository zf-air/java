package Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<String,String> map = 
				new HashMap<String,String>();
		map.put("001", "hello");
		map.put("002", "world");
		map.put("003", "java");
		
		System.out.println("key:004:"+map.containsKey("004"));
		System.out.println("value:hello:"+map.containsValue("hello"));
		//±éÀú
		Set<String> set = map.keySet();
		for(String key:set) {
			String value = map.get(key);
			System.out.println("key:"+key+" value:"+value);
		}
	}
}
