package recursion;

public class Recursion2 {
	//replace x with y
	public static String replaceChar(String s, char a, char b) {
		if(s.length() == 0)
			return s;
		String smallString = replaceChar(s.substring(1), a, b);
		if(s.charAt(0) == 'x') {
			return b+smallString;
		}
		else {
			return s.charAt(0)+smallString;
		}
	}
	//-------------------------------
	//replace pi with 3.14
	public static String replacePi(String s) {
		if(s.length() <=1)
			return s;
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			//call recursion on string length n-2
			String smallString = replacePi(s.substring(2));
			return "3.14"+smallString;
		}
		else {
			//call recursion on string length n-1
			String smallString = replacePi(s.substring(1));
			return s.charAt(0)+smallString;
		}
	}
	//--------------------------------------------------
	// binary search
	public static int binarySearch(int [] a, int si, int ei, int x) {
		if(si>ei)
			return -1;
		int midIndex = (si+ei)/2;
		if(a[midIndex] == x)
			return midIndex;
		else if(a[midIndex]<x) {
			return binarySearch(a, midIndex+1, ei, x);
		}
		else {
			return binarySearch(a, si, midIndex-1, x);
		}
	}
	//--------------------------------------------------
//	Given a string S, remove consecutive duplicates from it recursively.
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <=1)
            return s;
        String smallString = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == s.charAt(1)){
            return smallString;
        }
        else{
            return s.charAt(0)+smallString;
        }
	}
	//---------------------------------------------------
	
	public static void main(String[] args) {
		String s = "axbxcx";
		System.out.println(replaceChar(s, 'x', 'y'));
		System.out.println(replacePi("appicdpipig"));
		System.out.println(removeConsecutiveDuplicates("appicdpiiipig"));
		int[] array = {4,8,4,9,12,0,5};
		System.out.println(binarySearch(array, 0, array.length-1, 9));
	}
}
