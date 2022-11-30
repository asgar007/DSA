package dynamicPrograming;

public class MinCostPath {
	
	private static int minCostPathI(int[][] input) {
		int m = input.length;
		int n = input[0].length;
		int[][] dp = new int[m+1][n+1];
		//initialise with +ininity
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<dp[0].length; j++) {
				dp[i][j] = Integer.MAX_VALUE;
			}
		}
		//start filling(updating) from the below last
		for(int i=m-1; i>=0; i--) {
			for(int j=n-1; j>=0; j--) {
				if(i==m-1 && j==n-1) {
					dp[i][j] = input[i][j];
					continue;
				}
				int ans1 = dp[i+1][j];
				int ans2 = dp[i][j+1];
				int ans3 = dp[i+1][j+1];
				dp[i][j] = input[i][j] + Math.min(ans1, Math.min(ans2, ans3));
			}
		}
		return dp[0][0];
	}
	
	private static int minCostPathR(int[][] input, int i, int j){
		int m = input.length;
		int n = input[0].length;
		//base case
		if(i >= m || j>=n)
			return Integer.MAX_VALUE;
		//special case for last cell
		if(i == m-1 && j == n-1){
			return input[i][j];
		}
		//induction hypothesis
		int ans1 = minCostPathR(input, i+1,j);
		int ans2 = minCostPathR(input, i,j+1);
		int ans3 = minCostPathR(input, i+1,j+1);
		int myAns = input[i][j] + Math.min(ans1, Math.min(ans2,ans3));
		return myAns;

	}

	public static int minCostPath(int[][] input) {
		//Your code goes here
		return minCostPathR(input, 0,0);
	}
	
	public static void main(String[] args) {
		int input[][] = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
//		int ans = minCostPath(input);
//		System.out.println(ans);
		System.out.println(minCostPathI(input));
	}
}
