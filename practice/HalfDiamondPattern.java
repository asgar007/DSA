package practice;

import java.util.Scanner;

public class HalfDiamondPattern {
	// 83% pass test cases
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 2*n+1;
        int n1 = (m+1)/2;
        for(int i=1; i<=n1; i++) {
        	System.out.print("*");
        	for(int j=1; j<=i-1; j++) {
        		System.out.print(j);
        	}
        	if(i!=1) {
        		for(int d=i-2; d>=1; d--) {
            		System.out.print(d);
            	}
            	System.out.print("*");
        	}
        	System.out.println();
        }
        //------second part----
        int n2 = n1-1;
        for(int i=n2; i>=1; i--) {
        	System.out.print("*");
        	for(int j=1; j<=i-1; j++) {
        		System.out.print(j);
        	}
        	if(i!=1) {
        		for(int d=i-2; d>=1; d--) {
            		System.out.print(d);
            	}
            	System.out.print("*");
        	}
        	System.out.println();
        }

	}

}
