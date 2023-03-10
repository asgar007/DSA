package binaryTrees;

public class BinaryTreeNode<T> {
//	public type is being used so that other could access data, left right child
	public T data; 
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
