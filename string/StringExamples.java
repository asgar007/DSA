package string;

import java.util.ArrayList;

public class StringExamples {
	public static void main(String[] args) {
		
		String str1 = new String ("I love coding"); 
	    String str2 = "I love coding"; 
	    boolean check=(str2=="I love coding");
	    System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check);

	    String str = "c1 O$d@eeD o1c";
	    String s = "";
        for(int i=0; i<str.length(); i++){
            if(((str.charAt(i)>=65) && (str.charAt(i)<=90)) || ((str.charAt(i)>=97) && (str.charAt(i)<=122)) || ((str.charAt(i)>=48) && (str.charAt(i)<=57))){
                s = s+str.charAt(i);
            }
        }
        s = s.toLowerCase();
        System.out.println(s);
	    System.out.println(palindrome(s, 0, s.length()-1));
	    String a = "abc";
//	    powerset(a, 0, "");
	    permutation(a, 0, a.length()-1);
	}
	
	//Palindrome recursively
	public static boolean palindrome(String str, int l, int r) {
		//base case
		if(l>=r) {
			return true;
		}
		if(str.charAt(l) == str.charAt(r) && palindrome(str, l+1, r-1))
			return true;
		else
			return false;
	}
	
	//Powerset
	public static void powerset(String s, int index, String ans) {
		if(index >= s.length()) {
			System.out.print(ans + " ");
			return;
		}
		
		powerset(s, index+1, ans + s.charAt(index));
		powerset(s, index+1, ans);
	}
	
	// permutation
	public static void permutation(String s, int l, int r) {
		if(l == r) {
			System.out.print(s + " ");
		}
		for(int i=l; i<=r; i++) {
			s = swap(s, l, i);
			permutation(s, l+1, r);
			s = swap(s, l, i);
		}
	}

	private static String swap(String s, int l, int r) {
		char[] sArray = s.toCharArray();
		char temp = sArray[l];
		sArray[l] = sArray[r];
		sArray[r] = temp;
		return String.copyValueOf(sArray);
	}
}
