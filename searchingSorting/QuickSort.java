package searchingSorting;

public class QuickSort {

	public static int partition(int[] input, int si, int ei) {
		int pivotElement = input[si];
		int count = 0;
		for (int i = si + 1; i < input.length; i++) {
			if (pivotElement > input[i]) {
				count++;
			}
		}
		// swap
		int temp = input[si + count];
		input[si + count] = pivotElement;
		input[si] = temp;
		int i = si;
		int j = ei;

		while (i < j) {
			if (input[i] < pivotElement)
				i++;
			else if (input[j] >= pivotElement)
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
		if (si >= ei)
			return;
		int i = partition(input, si, ei);
		quickSort(input, si, i - 1);
		quickSort(input, i + 1, ei);
	}

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}

	public static void main(String[] args) {
		int a[] = { 3, 4, 1, 9, 1, 11 };
		quickSort(a);
		for (int arr : a) {
			System.out.print(arr + " ");
		}
	}
}
