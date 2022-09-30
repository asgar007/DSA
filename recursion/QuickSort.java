package recursion;

public class QuickSort {
	
	public static int partition(int[] input, int si, int ei) {
        int pivotElement = input[si];
		int count = 0;
		for(int i=si+1; i<input.length; i++) {
			if(pivotElement>input[i]) {
				count++;
			}
		}
        	//swap
            int temp = input[si + count];
            input[si + count] = pivotElement;
            input[si] = temp;
            int i = si;
            int j = ei;
            
            while(i<j) {
			if(input[i]< pivotElement)
				i++;
			else if(input[j]>=pivotElement)
				j--;
			else {
                int temp2 = input[i];
				input[i] = input[j];
                input[j] = temp2;
                i++;
                j--;
			}
		}
		return si + count;
	}
        
		public static void quickSort(int[] input, int si, int ei) {
			// your code goes here
            if(si>=ei)
				return;
            int i = partition(input, si, ei);
            quickSort(input, si, i-1);
            quickSort(input, i+1, ei);
            
            
		}
	public static void main(String[] args) {
		int[] input = {5,0,10,45,6,6,1,2,9,3};
		int s = 0;
		int e = input.length-1;
		quickSort(input,s,e);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
