package practice;

import java.util.List;
import java.util.Scanner;
public class Main {
	
	public static String modify(String s) {
		if(s.length() <= 1)
			return s;
		if(s.charAt(0) == s.charAt(1)) {
				return s.charAt(0) +"*" +modify(s.substring(1));
		}
		else 
			return s.charAt(0) + modify(s.substring(1));
	}
	
	public static void main(String[] args) {
		// Write your code here
//		Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int a[] = new int[n];
//        for(int i=0; i<n; i++){
//            a[i] = sc.nextInt();
//        }
//        int d = a[1]-a[0];
//        int k = 0;
//        for(int j=0; j<n-1; j++){
//            k = a[j+1]-a[j];
//        }
//        if(k!=d){
//                System.out.println("false");
//            }
//        else
//            System.out.println("true");  
//        int arr[] = {1,2,3,4,5};
//        makePair(arr);
//		
//	}
//
//	private static void makePair(int[] arr) {
//		int n = arr.length;
//		for(int i=0; i<n-1; i++) {
//			for(int j=i+1; j<n; j++) {
//				System.out.println("(" + arr[i] +","+ arr[j]+")");
//			}
//		}
		
		 String s = "asgaraali";
		 String ans = modify(s);
		System.out.println(ans);
	}
	 
}
