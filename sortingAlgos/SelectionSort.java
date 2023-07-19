package sortingAlgos;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int minIndex = i; // select ith as minimum
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//swap minIndex and i index
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2, 3, 1, 84, 1, 39};
//		int[] arr = {5,9,8,1,2};
		selectionSort(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
