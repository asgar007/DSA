package dynamicPrograming;

public class fibonacci {
	// with recursion - O(2^n)
	// with DP memoization O(n)
	public static int fib(int n, int dp[]) {
		if(n == 0 || n == 1) {
			return n;
		}
		int ans1, ans2;
		if(dp[n-1] == -1) {
			ans1 = fib(n-1, dp);
			dp[n-1] = ans1;
		}
		else {
			ans1 = dp[n-1];
		}
		if(dp[n-2] == -1) {
			ans2 = fib(n-2, dp);
			dp[n-2] = ans2;
		}
		else {
			ans2 = dp[n-2];
		}
		
		return ans1 + ans2;
	}
}
