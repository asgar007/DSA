package stackUsingLinkedList;

import stackUsingArray.StackEmptyException;

public class StackUsingLL<T> {
	private Node<T> head;
	private int size;
	
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T pop() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		Node<T> temp = head;
		head = head.next;
		size--;
		return temp.data;
	}
	
	public T top() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		
		return head.data;
	}
}
