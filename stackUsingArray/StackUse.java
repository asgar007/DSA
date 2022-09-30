package stackUsingArray;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(45);
		
		stack.size();
		boolean ans = stack.isEmpty();
		System.out.println(ans);
//		stack.pop();
//		stack.top();
	}

}
