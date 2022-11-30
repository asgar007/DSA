package dynamicPrograming;

public class Driver {
	public static void main(String[] args) {
		int n = 5;
		int[] dp = new int[n];
		for(int i=0; i<dp.length; i++) {
			dp[i] = -1;
		}
		int ans = fibonacci.fib(n, dp);
//		System.out.println(ans);
		//------------------------
		int ansMinNo = MinNumberSquare.minCountIter(9);
		System.out.println(ansMinNo);
	}
}
