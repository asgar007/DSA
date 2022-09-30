package practice;

public class MaxOutOfNum {
	// Java program to implement
	// the above approach

	// Function to return the
		// largest number possible
		static int maxnumber(int n, int k)
		{
			// Generate the largest number
			// after removal of the least
			// K digits one by one
			for (int j = 0; j < k; j++) {

				int ans = 0;
				int i = 1;

				// Remove the least digit
				// after every iteration
				while (n / i > 0) {

					// Store the numbers formed after
					// removing every digit once
					int temp = (n / (i * 10))
								* i
							+ (n % i);
					i *= 10;

					// Compare and store the maximum
					ans = Math.max(ans, temp);
				}
				n = ans;
			}

			// Return the remaining number
			// after K removals
			return n;
		}

		// Driver code
		public static void main(String[] args)
		{
			int n = 6358;
			int k = 1;

			System.out.println(maxnumber(n, k));
		}

}
