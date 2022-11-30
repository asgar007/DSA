package dynamicPrograming;

import java.util.HashMap;

public class ByteLandian {
	
	public static long bytelandian(long n) {
		int dp[] = new int[(int) (n+1)];
		for(int i=0; i<dp.length; i++) {
			dp[i] = i;
		}
		for(int i=0; i<dp.length; i++) {
			dp[i] = Math.max(dp[i], (dp[i/2] + dp[i/3] + dp[i/4]));
		}
		return dp[(int)n];
	}
	
	public static long bytelandianBetter(long n, HashMap<Long, Long> memo) {
        // Write your code here
        //Handle base case for n=0,1
        if (n<12)
        {
            memo.put(n,n);
            return n;
        }
        
        if (!memo.containsKey(n))
        {
            long ans1=bytelandianBetter(n/2,memo);
        	long ans2=bytelandianBetter(n/3,memo);
        	long ans3=bytelandianBetter(n/4,memo);
        
        	long currVal=ans1+ans2+ans3;
        	if (currVal>n)
            	memo.put(n,currVal);
        	else
            	memo.put(n,n);
            
        }
        
        return memo.get(n);
            
        /*
        //Recursive solution
        
        memo.put((long)0,(long)0);
        memo.put((long)1,(long)1);
        
        for (int i=2;i<=n;i++)
        {
            long ans1=memo.get(i/2);
            long ans2=memo.get(i/3);
            long ans3=memo.get(i/4);
            
            long currentVal=ans1+ans2+ans3;
            if (currentVal>i)
            {
                memo.put((long)i,currentVal);
            }
            else
            {
                memo.put((long)i,(long)i);
            }
        }
        
        return memo.get(n);
        */    
	}
	
	public static void main(String[] args) {
		HashMap<Long, Long> memo = new HashMap<>();
		System.out.println(bytelandianBetter(16, memo));
	}
}
