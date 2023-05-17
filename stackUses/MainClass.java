package stackUses;

import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		BalancedParanthesis paranthesis = new BalancedParanthesis();
		
		boolean  ans = paranthesis.isBalanced("(())");
		System.out.println(ans);
		//------------------------------------
		
		RedundantBracket check = new RedundantBracket();
		System.out.println(check.checkRedundantBracket("(d+c)"));
	}
}
