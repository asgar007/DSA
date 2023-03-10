package trees;

import java.util.ArrayList;

public class TreeNode<T> {
	T data;
//	list of reference to children tree
	ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}
}
