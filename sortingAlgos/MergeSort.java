package sortingAlgos;

public class MergeSort {
	
	
	public static void merge(int[] s1, int[] s2, int[] input){
        int j=0;
        int k=0;
        int i=0;
        while(j<s1.length && k<s2.length){
            if(s1[j]<=s2[k]){
                input[i] = s1[j];
                j++;
                i++;
            }
            else{
                input[i] = s2[k];
                k++;
                i++;
            }
        }
        //copy remainings
        while(j<s1.length){
            input[i] = s1[j];
            i++;
            j++;
        }
        
        while(k<s2.length){
            input[i] = s2[k];
            i++;
            k++;
        }
    }
	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length <=1)
            return;
        
		int[] s1 = new int[input.length/2];
        int[] s2 = new int[input.length-s1.length];
        for(int i=0; i<input.length/2; i++){
            s1[i] = input[i];
        }
        for(int i=input.length/2; i<input.length; i++){
            s2[i-input.length/2] = input[i];
        }
        mergeSort(s1);
        mergeSort(s2);
        merge(s1,s2,input);
	}
	//-------------------------------------------------------------------------
	
//	public static int[] mergeSort(int arr[], int lo, int hi) {
//		//base case
//		if(lo == hi) {
//			int baseArray[] = new int[1];
//			baseArray[0] = arr[lo];
//			return baseArray;
//		}
//		int mid = (lo+hi)/2;
//		int[] firstSortedHalfArray = mergeSort(arr, lo, mid);
//		int[] secondSortedHalfArray = mergeSort(arr, mid+1, hi);
//		int[] res = mergeTwoSortedArray(firstSortedHalfArray, secondSortedHalfArray);
//		return res;
//	}
//	
//	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
//		int[] res = new int[arr1.length + arr2.length];
//		int i = 0, j=0, k=0;
//		while(i<arr1.length && j<arr2.length) {
//			if(arr1[i]<arr2[j]) {
//				res[k] = arr1[i];
//				k++; i++;
//			}
//			else {
//				res[k] = arr2[j];
//				k++; j++;
//			}
//		}
//		//copy all remaining from arr1
//		while(i<arr1.length) {
//			res[k] = arr1[i];
//			i++; k++;
//		}
//		//copy all remaining from arr2
//		while(j<arr2.length) {
//			res[k] = arr2[j];
//			j++; k++;
//		}
//		return res;
//	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2, 3, 1, 84, 1, 39};
//		int[] arr = {5,9,8,1,2};
		
//		int res[] = mergeSort(arr, 0, arr.length - 1);
		mergeSort(arr);
		for(int i: arr) {
			System.out.print(i + " ");
		}
	}
}
