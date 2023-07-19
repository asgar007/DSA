package string;

public class ReplaceChar {
	
	
	
	public static void main(String[] args) {
		String ans = replaceCharWithAnotherChar("abcdcpsc", 'c', 'x');
		System.out.println(ans);
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
