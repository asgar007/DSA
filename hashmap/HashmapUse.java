package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapUse {
	
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
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,2,3,4,1,3};
		ArrayList<Integer> ans = removeDuplicates(arr);
		for(int i : ans) {
			System.out.print(i + ",");
		}
	}
}
