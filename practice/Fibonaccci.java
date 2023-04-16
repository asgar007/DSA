package practice;

import java.util.Scanner;

public class Fibonaccci {
	
	public static int fibonacciRecursively(int n) {
		//base case
		if(n <= 1) {
			return n;
		}
		int nextNum = fibonacciRecursively(n-2) + fibonacciRecursively(n-1);
		return nextNum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a = 1;
		int b = 1;
		int c = 0;
		System.out.print(a + " ");
		System.out.print(b+ " ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.print(c+ " ");
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println("recursive result: ");
		System.out.print("1 ");
		for(int i=2; i<=n; i++) {
			System.out.print(fibonacciRecursively(i)+" ");
		}
	}
}
