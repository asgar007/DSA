package recursion;

public class Subsequence {
	
	private static String[] getSS(String str) {
		if(str.length() == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = getSS(str.substring(1));
		String[] output = new String[smallOutput.length * 2];
		for(int i=0; i<smallOutput.length; i++) {
			output[i] = smallOutput[i];
		}
		for(int i=0; i<smallOutput.length; i++) {
			output[smallOutput.length + i] = str.charAt(0) + smallOutput[i];
		}
		return output;
	}
	
	private static void getSS2(String str, String stringSoFar) {
		if(str.length() == 0) {
			System.out.print(stringSoFar + ", ");
			return;
		}
		String smallString = str.substring(1);
		getSS2(smallString, stringSoFar);
		getSS2(smallString, stringSoFar + str.charAt(0));
	}
	
	public static void main(String[] args) {
		String str = "abc";
		String[] ans = getSS(str);
		for(String s: ans) {
			System.out.print(s+", ");
		}
		System.out.println();
		getSS2(str, "");
	}
}
