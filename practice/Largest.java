package practice;

public class Largest {
	public static void main(String[] args) {
		int arr[] = {1,3,5,4,9,9};
		int n = arr.length;
		int l = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for(int i =0; i<n; i++) {
			if(arr[i]>l)
				l= arr[i];
		}
		System.out.println(l);
		for(int i =0; i<n; i++) {
//			if(arr[i])
			if(arr[i]>s && arr[i]<l) {
				s= arr[i];
			}
				
		}
		System.out.println(s);
	}

}
