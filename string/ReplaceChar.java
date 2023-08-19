package string;

public class ReplaceChar {
	
	public static void main(String[] args) {
		String ans = replaceCharWithAnotherChar("abcdcpsc", 'c', 'x');
		System.out.println(ans);
		String resultOfPI = replacePI("piabcppispipdjpi");
		System.out.println(resultOfPI);
		String removeDupResult = removeConsecutiveDuplicates("aaddfhhswhiioo");
		System.out.println(removeDupResult);
	}
	
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
	
	private static String replacePI(String s) {
		if(s.length() <= 1)
			return s;
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			//call recursion to n-2
			String smallOutput = replacePI(s.substring(2));
			return "(3.14)" + smallOutput;
		}else {
			//call recursion to n-1
			String smallOutput = replacePI(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}

	private static String replaceCharWithAnotherChar(String str, char a, char b) {
		// base case
		if(str.length() == 0)
			return str;
		// recursive call to sub string (first to break down string to very base level)
		String smallOutput = replaceCharWithAnotherChar(str.substring(1), a, b);
		
		// if first character is a then change to b else return with same character
		if(str.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return str.charAt(0) + smallOutput;
		}
	}

}
