package searchingSorting;

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
	
	public static void main(String[] args) {
		int a[] = {3,4,1,9,1,11};
		mergeSort(a);
		for(int arr : a) {
			System.out.print(arr + " ");
		}
		
	}
}
