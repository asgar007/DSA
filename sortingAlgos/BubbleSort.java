package sortingAlgos;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) { // -i do coz last part already sorted
				if(arr[j-1] > arr[j]) {
					//swap them
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSortRecursively(int[] arr, int index) {
		//base case
		if(index >= arr.length)
			return;
		for(int i=0; i<arr.length; i++) {
			if(arr[index-1] > arr[index]) {
				//swap them
				int temp = arr[index];
				arr[index] = arr[index-1];
				arr[index-1] = temp;
			}
			bubbleSortRecursively(arr, index+1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2, 3, 1, 84, 1, 39};
//		bubbleSort(arr);
		bubbleSortRecursively(arr, 1);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
