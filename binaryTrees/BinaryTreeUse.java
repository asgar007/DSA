package binaryTrees;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null)
			return -1;
		int leftLargest = largest(root.left);
		int rightLargest = largest(root.right);
		int max = Math.max(root.data, Math.max(leftLargest, rightLargest));
		return max;
	}
	
	public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x){
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
	
	public static int numNodes(BinaryTreeNode<Integer> root) {
		if(root == null)
			return 0;
		int leftNodes = numNodes(root.left);
		int rightNodes = numNodes(root.right);
		return 1 + leftNodes + rightNodes;
	}
	
	public static BinaryTreeNode<Integer> takeInputTreeBetter(boolean isRoot, int parentData, boolean isLeft){
		if(isRoot)
			System.out.println("Enter root data:");
		else {
			if(isLeft) {
				System.out.println("Enter left child of "+ parentData);
			}
			else {
				System.out.println("Enter right child of "+ parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInputTreeBetter(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeInputTreeBetter(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputTree(){
		System.out.println("Enter root data:");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInputTree();
		BinaryTreeNode<Integer> rightChild = takeInputTree();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null)
			return;
		System.out.print(root.data + ": ");
		if(root.left != null) { // if both if stmt is not there null pointer exp will be there
			System.out.print("L"+ root.left.data + ", ");
		}
		if(root.right != null) {
			System.out.print("R"+ root.right.data);
		}
		System.out.println();// for new line
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//		
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		
//		
//		BinaryTreeNode<Integer> twosRight = new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> threesLeft = new BinaryTreeNode<Integer>(5);
//		rootLeft.right = twosRight;
//		rootRight.left = threesLeft;
		BinaryTreeNode<Integer> root = takeInputTreeBetter(true, 0, true);
		int numberOfNodes = numNodes(root);
		printTreeDetailed(root);
		System.out.println("Total nodes are: " + numberOfNodes);
		System.out.println("Largest : " + largest(root));
		
	}

}
