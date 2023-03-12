package sortingAlgos;

public class InsertionSort {
	
	public static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[j+1] < arr[j]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else { // else written to reduce to reduce the unnecessary iteration
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = {4, 5, 1, 2, 3, 1, 84, 1, 39};
		int[] arr = {5,9,8,1,2};
		insertionSort(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}

}
