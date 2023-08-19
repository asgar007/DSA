package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CountFrequency {
	
	public static void main(String[] args) {
		countFreq("abcabbbcd");
	}

	private static void countFreq(String s) {
		//we can use Hashmap
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		// you can also print maximum occurrence of character
		int maxValue = 0;
		char maxCharacter = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int value = map.get(ch);
			if(maxValue < value) {
				maxValue = value;
				maxCharacter = ch;
			}
		}
		System.out.println("Maximum occuring character => " + maxCharacter + ":" + maxValue);
		
		// print frequency of all characters (iterate over hashmap)
		Set<Character> keys = map.keySet();
		for(Character i: keys) {
			int value = map.get(i);
			System.out.println(i + ":" + value);
		}
	}
}
