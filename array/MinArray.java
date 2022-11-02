package array;

public class MinArray {
	public static int min(int[] arr, int index) {
		if(index == arr.length) {
			return Integer.MAX_VALUE;
		}
		int smallOutput = min(arr, index + 1);
		if(smallOutput < arr[index])
			return smallOutput;
		else
			return arr[index];
	}
	// advanced recursion3
	public static void min2(int[] arr, int index, int minAns) {
		if(index == arr.length) {
			System.out.println(minAns);
			return;
		}
		if(minAns > arr[index]) {
			minAns = arr[index];
		}
		min2(arr, index + 1, minAns);
	}
}
