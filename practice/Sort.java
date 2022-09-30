package practice;

public class Sort {

	private static void selectionSort(int[] arr) {
		int n = arr.length;
        for(int i=0; i<n-1; i++){
        // int min = arr[i];
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
            
        }
        printSort(arr);
		
	}
	
	private static void insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int temp = a[i];
			for(int j=i; j>0; j--) {
				if(temp<a[j-1]) {
					int t = a[j-1];
					a[j-1] = a[j];
					a[j] = t;
				}
			}
		}
		printSort(a);
		
	}

	

	private static void printSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		int a[] = {8,2,0,5,3,2};
//		selectionSort(a);
		insertionSort(a);
	}

}
