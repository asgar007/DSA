package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
		removeDups("abcdcapqqrr");
	}

	private static void removeDups(String s) {
		//approach1 using java8
		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(ch-> sb1.append((char)ch));
		System.out.println(sb1);
		
		//approach2 indexOf
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int index = s.indexOf(ch, i+1);
			if(index == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		//approach3 using two for loop 
		StringBuilder sb3 = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			boolean flag = false;
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				sb3.append(s.charAt(i));
			}
		}
		System.out.println(sb3);
		
		// approach 4 using hasmap or set you can get the frequency of characters also.
		StringBuilder sb4 = new StringBuilder();
//		Set<Character> set = new HashSet<>();
//		for(int i=0; i<s.length(); i++) {
//			set.add(s.charAt(i));
//		}
//		set.forEach(ch-> sb4.append(ch));
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				continue;
			}
			else {
				sb4.append(ch);
				map.put(ch, 1);
			}
		}
		System.out.println(sb4);
	}
}
