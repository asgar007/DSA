package practice;

import java.util.Scanner;

public class Fibonaccci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a);
		System.out.print(b);
		while(c<n) {
			c=a+b;
			System.out.print(c);
			a=b;
			b=c;
		}
	}
}
