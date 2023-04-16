import java.util.Scanner;

public class BinSearch {
	int arr[];
	int n;

	public BinSearch(int nn) {
		n = nn; //asignment operator
		arr = new int[n];
	}

	void fillArray() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.println("Enter a no");
			arr[i] = sc.nextInt();
		}
	}

	void sort() {
		// Sort the array in ascending order
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	int search(int element, int low, int high) {
		// Repeat until the pointers low and high meet each other
	    while (low <= high) {

	      // get index of mid element
	      int mid = low + (high - low) / 2;

	      // if element to be searched is the mid element
	      if (arr[mid] == element)
	        return mid;

	      // if element is less than mid element
	      // search only the left side of mid
	      if (arr[mid] < element)
	        low = mid + 1;

	      // if element is greater than mid element
	      // search only the right side of mid
	      else
	        high = mid - 1;
	    }
	    return -1;
	}
	
	void print() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		BinSearch ob = new BinSearch(5);
		ob.fillArray();
		ob.sort();
		ob.print();
		int ans = ob.search(5, 0, 4);
		if(ans == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println("found at index : "+ ans);
		}
	}
	
}
