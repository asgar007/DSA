package dynamicPrograming;

public class MinNumberSquare {
	
	public static int minCountIter(int n) {
		int dp[] =new int[n+1];
		dp[0] = 0;
		for(int i=1; i<=n; i++) {
			int min = Integer.MAX_VALUE;
			for(int j=1; j*j<i; j++) {
				int currAns = dp[i-(j*j)];
				if(currAns < min)
					min = currAns;
			}
			dp[i] = min+1;
		}
		
		return dp[n];
	}

	public static int minCount(int n) {
		if(n == 0){
			return 0;
		}
		int min = Integer.MAX_VALUE;

		for(int i=1; i*i<=n; i++){
			int currAns = minCount(n - i*i);
			if(currAns < min)
				min = currAns;
		}
		
		return min + 1;
	}
	}
	

