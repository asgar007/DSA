package sortingAlgos;

public class MergeSort {
	
	public static int[] mergeSort(int arr[], int lo, int hi) {
		//base case
		if(lo == hi) {
			int baseArray[] = new int[1];
			baseArray[0] = arr[lo];
			return baseArray;
		}
		int mid = (lo+hi)/2;
		int[] firstSortedHalfArray = mergeSort(arr, lo, mid);
		int[] secondSortedHalfArray = mergeSort(arr, mid+1, hi);
		int[] res = mergeTwoSortedArray(firstSortedHalfArray, secondSortedHalfArray);
		return res;
	}
	
	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int i = 0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k] = arr1[i];
				k++; i++;
			}
			else {
				res[k] = arr2[j];
				k++; j++;
			}
		}
		//copy all remaining from arr1
		while(i<arr1.length) {
			res[k] = arr1[i];
			i++; k++;
		}
		//copy all remaining from arr2
		while(j<arr2.length) {
			res[k] = arr2[j];
			j++; k++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2, 3, 1, 84, 1, 39};
//		int[] arr = {5,9,8,1,2};
		
		int res[] = mergeSort(arr, 0, arr.length - 1);
		for(int i: res) {
			System.out.print(i + " ");
		}
	}
}
