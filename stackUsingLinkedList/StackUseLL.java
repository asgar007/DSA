package stackUsingLinkedList;

import stackUsingArray.StackEmptyException;

public class StackUseLL {
	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		stack.push(10);
		stack.push(45);
		
		int size = stack.size();
		boolean ans = stack.isEmpty();
		System.out.println(ans);
//		Integer pop = stack.pop();
		Integer top = stack.top();
		System.out.println(top);
	}
}
