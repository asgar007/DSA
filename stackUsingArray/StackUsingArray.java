package stackUsingArray;

public class StackUsingArray {
	private int data[]; //private for abstraction coz we need LIFO i.e access of  top element only
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[2];
		topIndex = -1;  // 
	}

	public void push(int elem) {
		if(topIndex == data.length - 1) {
			//throw stack full exception
//			StackFullException e = new StackFullException();
//			throw e;
//			throw new StackFullException();
			doubleTheCapacity();
		}
		data[++topIndex] = elem;
	}

	private void doubleTheCapacity() {
		int[] temp = data;
		data = new int[2*temp.length];
		//copy prev data
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}

	public void size() {
		System.out.println(topIndex+1);
		
	}

	public boolean isEmpty() {
//		if(topIndex == -1)
//			return true;
//		else
//			return false;
		return topIndex == -1;
	}

	public void pop() throws StackEmptyException {
		if(topIndex == -1) {
			//throw stack empty exception
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--;
		System.out.println(temp);
	}

	public void top() throws StackEmptyException {
		if(topIndex == -1) {
			//throw stack empty exception
			throw new StackEmptyException();
		}
		else
			System.out.println(data[topIndex]);
	}
}
