package javastudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	// Map -> 순서 x 중복(키x, 값o)
	public static void main(String[] args) {
	Map<String, String> map = new HashMap<>();
	// map.put(key, value)
	map.put("001", "kim");
	map.put("002", "lee");
	map.put("003", "choi");
	
	map.put("001", "kang");
	
	System.out.println(map.size()); // 3
	
	System.out.println(map.get("001")) ; // kang
	// map은 새로 들어온 값으로 키를 바꾼다  
	System.out.println(map.get("002"));	
	
	Set<String> keys = map.keySet(); 

	Iterator<String> iter = keys.iterator();
	while(iter.hasNext()) {
		String key = iter.next();
		String value = map.get(key);
		System.out.println(key + ":" +value);
		
		/* 
		 * 001:kang 002:lee 003:choi return 
		 */
		
		}
	}
}
