package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashmapUse {
	//remove duplicates
	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i=0 ;i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			else {
				output.add(arr[i]);
				map.put(arr[i], true);
			}
		}
		return output;
	}
	
	//count characters
	public static void countCharacters(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int value = map.get(ch);
                map.put(ch, value + 1);
            }else{
                map.put(ch, 1);
            }
        }
        Set<Character> keys = map.keySet();
        for(Character key: keys){
            System.out.print(key + ":" + map.get(key) + " ");
        }
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,2,3,4,1,3};
		ArrayList<Integer> ans = removeDuplicates(arr);
		for(int i : ans) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		countCharacters("abcdcshs");
	}
}
