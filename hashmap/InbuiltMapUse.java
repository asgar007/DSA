package hashmap;

import java.util.HashMap;
import java.util.Set;

public class InbuiltMapUse {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("efg", 2);
		if(map.containsKey("abc")) {
			System.out.println("its there!");
		}
		int n = map.get("efg");
		System.out.println(n);
		int v=0;
		if(map.containsKey("xyz")) {// we are checking to avoid null pointer exception
			v = map.get("xyz");
		}
		System.out.println(v);
		Set<String> keys = map.keySet();//all keys
		for(String s: keys) {
			System.out.println(s);
		}
	}
}
