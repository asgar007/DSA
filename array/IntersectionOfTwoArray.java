package array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray {
	// using HashMap
	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int key : arr1){
			if(map.containsKey(key)){
				int value = map.get(key);
				map.put(key, value+1);
			}
			else{
				map.put(key, 1);
			}
		}
		Arrays.sort(arr2);// its being asked
		for(int key : arr2){
			if(map.containsKey(key)){
				int value = map.get(key);
				if(value > 0){// very important
					System.out.print(key + " ");
					map.put(key, value - 1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,5,6,8,4,1,0,5,2};
		int[] arr2 = {0,1,7,7,8,4,8,0,5,2,2,2};
		intersection(arr1, arr2);
 	}
}
