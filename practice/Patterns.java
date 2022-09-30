package practice;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// for(int i =1 ; i<=n; i++){
//	      char ch = (char)('A'+n-i);
//	      for(int j =1 ; j<=i; j++){
//	          System.out.print(ch);
//	          ch = (char)(ch+1);
//	      }
//	      System.out.println();
		// }
		//
//		Scanner sc = new Scanner(System.in);
		// int n = sc.nextInt();
		// int k = n;
		// for(int i =1; i<=n; i++,k--){
//	      for(int j =1 ; j<=k; j++){
//	          System.out.print("*");
//	      }
//	      System.out.println();
		// }

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i =1;i<=n; i++) {
//			int k = 1;
//			while(k<=n-i) {
//				System.out.print(" ");
//				k++;
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i =1;i<=n; i++) {
//			int k = 1;
//			while(k<=i-1) {
//				System.out.print(" ");
//				k++;
//			}
//			for(int j=1; j<=n-i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int space=1; space<=n-i;space++){
//                System.out.print(" ");
//            }
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++){
//            
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print("*");
//            }
//            for(int space=1; space<=i-1;space++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//        int k=0;
//        for(int i=1; i<=n; i++){
//            k=n-i+1;
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(k);
//            }
//            for(int s=1;s<=i-1; s++){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//       for(int i=1;i<=n;i++) {
//    	   for(int s=1;s<=n-i;s++) {
//    		   System.out.print(" ");            
//    	   }
//    	   for(int j=1; j<=i; j++) {
//    		   System.out.print("*");
//    	   }
//    	   for(int d=i-1; d>=1; d--) {
//    		   System.out.print("*");
//    	   }
//    	   System.out.println();
//       }
//        for(int i=1;i<=n;i++){
//            for(int s=1;s<=n-i;s++){
//                System.out.print(" ");
//            }
//            
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            
//            for(int d=i-1; d>=1;d--) {
//            	System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1;i<=n;i++){
//            for(int s=1; s<=n-i;s++){
//                System.out.print(" ");
//            }
//			int k = i;
//            for(int j=1;j<=i;j++,k++){
//                System.out.print(k);
//            }
//            for(int d=i-1;d>=1;d--,k--){
//                System.out.print(k-2);
//            }
//            System.out.println();
//        }
//        int n1 = (n+1)/2;
//        for(int i = 1; i<=n1; i++){
//            for(int s = 1; s<=n1-i; s++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        //----------------second part-
//        int n2 = ((n+1)/2)-1;
//        for(int i = n2; i>=1; i--){
//            for(int s = 1; s<=n2-i+1; s++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n; i++){
//        	int sum = 0;
//            for(int num=1; num<=i; num++){
//            	sum += num;
//                System.out.print(num);
//                if(num!=i) {
//                	System.out.print("+");
//                }
//            }
//            System.out.print("=");
//            System.out.print(sum);
//            System.out.println();
//        }
//        for(int i=1; i<=n; i++) {
//        	int odd = 2*i-1;
//        	for(int num=1; num<=n-i+1; num++) {
//        		System.out.print(odd);
//        		odd += 2;
//        	}
//        	for(int s=1; s<=i-1; s++) {
//        		int odd1 = 2*s-1;
//        		System.out.print(odd1);
//        	}
//        	System.out.println();
//        }

//        System.out.println(10 & 2);
//        System.out.println(10 | 2);
//        System.out.println(10 ^ -20);
//        System.out.println(~2);
//        int fib[] = new int[n+1];
//        int i;
//        fib[0]=0;
//        if(n>0){
//            fib[1]=1;
//            for(i=2; i<=n; i++){
//                fib[i]= fib[i-1] + fib[i-2];
//            }
//            System.out.println(fib[n]);
//        }
//        int x = sc.nextInt();
		
//        int array[] = new int[n];
//        boolean isdec = true;
//        for(int i=0; i<n; i++){
//            array[i]=sc.nextInt();
//        }
//        for(int j=0; j<n-1; j++) {
//        	if(array[j]==array[j+1]) {
//        		System.out.println("false");
//        		return;
//        	}
//        	else if(array[j]>array[j+1]) {
//        		isdec = false;
//        	}
//        	else if(array[j]<array[j+1]) {
//        		if(isdec==false) {
//        			System.out.println("false");
//        			return;
//        		}	
//        	}
//        }
//        System.out.println("true");
		
		
		
		//=========================================
//		Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(n-j+1);
//            }
//            System.out.print("*");
//            for(int k=i-1; k>=1; k--){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

	}
}
