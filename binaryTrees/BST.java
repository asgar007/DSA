package binaryTrees;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;

	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
        if(node == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(x);
            return newNode;
        }
        if(x < node.data){
            node.left = insertHelper(node.left, x);
        }
        
        else{
            node.right = insertHelper(node.right, x);
        }
        return node;
    }
	
	public void insert(int data) {
		root = insertHelper(root, data);
		size++;
	}
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x) {
		if (node == null)
			return false;
		if (node.data == x)
			return true;
		if (x < node.data) {
			// call left side
			return isPresentHelper(node.left, x);
		} else {
			// call right side
			return isPresentHelper(node.right, x);
		}
	}

	public boolean isPresent(int x) {
		return isPresentHelper(root, x);
	}

	private void printTreeHelper(BinaryTreeNode<Integer> node) {
		if(node == null)
			return;
		System.out.print(node.data + ": ");
		if(node.left != null) { // if both if stmt is not there null pointer exp will be there
			System.out.print("L"+ node.left.data + ", ");
		}
		if(node.right != null) {
			System.out.print("R"+ node.right.data);
		}
		System.out.println();// for new line
		
		printTreeHelper(node.left);
		printTreeHelper(node.right);
	}

	public void printTree() {
		printTreeHelper(root);
	}

}
