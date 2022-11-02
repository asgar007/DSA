package recursion;

import java.util.Scanner;

public class KeyPad {
	
	private static String[] keyPadCombination(int input) {
		if(input == 0) {
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		String[] smallOutput = keyPadCombination(input/10);
		int lastDigit = input%10;
		String lastDigitOption = getOption(lastDigit);
		String[] outputString = new String[smallOutput.length * lastDigitOption.length()];
		int k=0;
		for(int i=0; i<smallOutput.length; i++) {
			for(int j=0; j<lastDigitOption.length(); j++) {
				outputString[k] = smallOutput[i] + lastDigitOption.charAt(j);
				k++;
			}
		}
		return outputString;
	}
	
	private static void keyPadCombination2(int input, String StringSoFar) {// recursion 3 topic concept
		if(input == 0) {
			System.out.print(StringSoFar + ", ");
			return;
		}
		int lastDigit = input%10;
		String lastDigitOption = getOption(lastDigit);
		for(int i=0; i<lastDigitOption.length(); i++) {
			keyPadCombination2(input/10, lastDigitOption.charAt(i) + StringSoFar);
		}
		
	}
	
	private static String getOption(int lastDigit) {
		if(lastDigit == 1)
			return "";
		if(lastDigit == 2)
			return "abc";
		if(lastDigit == 3)
			return "def";
		if(lastDigit == 4)
			return "ghi";
		if(lastDigit == 5)
			return "jkl";
		else
			return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		String[] ans = keyPadCombination(input);
		for(String output : ans) {
			System.out.print(output + ", ");
		}
		System.out.println();
		keyPadCombination2(input, "");
	}

}
