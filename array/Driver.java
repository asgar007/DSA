package array;

public class Driver {
	public static void main(String[] args) {
		int[] input = {10,7,4,8,2,9};
		int ans = MinArray.min(input, 0);
		System.out.println(ans);
		MinArray.min2(input, 0, input[0]);
	}
}
