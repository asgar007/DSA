package sortingAlgos;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					//swap them
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2, 3, 84, 55, 39};
		bubbleSort(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
