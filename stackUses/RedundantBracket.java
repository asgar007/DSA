package stackUses;

import java.util.Stack;

public class RedundantBracket {
	
	public static boolean checkRedundantBracket(String s) {
		
		Stack<Character> stack = new Stack<>();
		boolean ans = false;
		for(int i=0; i<s.length(); i++) {
			int count = 0;
			char ch = s.charAt(i);
			if(ch != ')') {
				stack.push(ch);
			}
			else {
				while(stack.peek() != '(') {
					stack.pop();
					count++;
				}
				stack.pop();
			}
			if(count >= 2) {
				ans = false;
//				count = 0;
			}
			else {
				return true;
			}
		}
		return ans;
	}

}
