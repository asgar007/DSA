package searchingSorting;

import java.util.*;

public class RoofTop {

    public static int findMaxSteps(int[]arr) {
        //write your code here
    	int maxSteps =0;
    	int count = 0;
    	int i=0;
    	while(i<arr.length) {
    		if(arr[i] < arr[i+1]) {
    			count++;
    			i++;
    		}
    		if(count > maxSteps) {
    			maxSteps = count;
    		}
    		else {
    			count = 0;
    			i++;
    		}
    	}
        return maxSteps;
    }

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];
        for(int i = 0 ; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = findMaxSteps(arr);
        System.out.println(ans);
    }
}