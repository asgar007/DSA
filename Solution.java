import java.util.*;
public class Solution 
{
	public static void main(String args[])
	{
		int n=0;
		int p=3;
		int q=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("N = ");
		n=sc.nextInt();
		
		if(n%2!=0) {
			System.out.println("Invalid input..number is out of range");
			return;
		}
		else if(n<10 || n>49)
		{
			System.out.println("Invalid input..number is out of range");
			return;
		}
		System.out.println("Prime pairs are:-");
		while(p<n)
		{
			q=n-p;
			if(isPrime(p) && isPrime(q) && p<=q)
			System.out.println(p +","+ q);
				p+=2;
		}
	}
	    static boolean isPrime(int n)
	    {
	    	for(int i=2; i<n; i++){
	            if(n%i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	    
	}
