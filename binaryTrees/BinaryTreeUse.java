package binaryTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {
	
	public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int x){
		if(root == null)
			return null;
		if(root.data == x) {
			ArrayList<Integer> ans  = new ArrayList<Integer>();
			ans.add(root.data);
			return ans;
		}
		//if not look for left and right tree
		ArrayList<Integer> leftTreePath = rootToNodePath(root.left, x);
		//check whether you get path or not if yes apend the root data
		if(leftTreePath != null) {
			leftTreePath.add(root.data);
			return leftTreePath;
		}
		ArrayList<Integer> rightTreePath = rootToNodePath(root.right, x);
		//check whether you get path or not if yes apend the root data
		if(rightTreePath != null) {
			rightTreePath.add(root.data);
			return rightTreePath;
		}
		return null;
	}
	
	public static IsBSTReturn isBSTBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			IsBSTReturn ans = new IsBSTReturn(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
			return ans;
		}
		IsBSTReturn leftAns = isBSTBetter(root.left);
		IsBSTReturn rightAns = isBSTBetter(root.right);
		boolean isBST = true;
		if(leftAns.max >= root.data) {
			isBST = false;
		}
		if(rightAns.min < root.data) {
			isBST = false;
		}
		if(!leftAns.isBST)
			isBST = false;
		if(!rightAns.isBST)
			isBST = false;
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
		int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
		IsBSTReturn ans = new IsBSTReturn(max, min, isBST);
		
		return ans;
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) { // 3 condition should satisfy 
		if(root == null)
			return true;
		//max in left tree should < root data
		int maxInLeftTree = largest(root.left);
		if(maxInLeftTree >= root.data)
			return false;
		//min in right tree should > root data
		int minInRightTree = minimum(root.right);
		if(minInRightTree < root.data)
			return false;
		// left and right tree should be bST as well
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		return (isLeftBST && isRightBST);
	}
	
	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null)
			return Integer.MAX_VALUE;
		int leftMinimun = minimum(root.left);
		int rightMinimum = minimum(root.right);
		int min = Math.min(root.data, Math.min(leftMinimun, rightMinimum));
		return min;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null)
			return Integer.MIN_VALUE;
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
		return 1 + leftNodes + rightNodes; // adding 1 is very imp
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
		IsBSTReturn ans = isBSTBetter(root);
		System.out.println("is BST->" + ans.isBST);
		ArrayList<Integer> path = rootToNodePath(root, 9);
		for(int i : path) {
			System.out.print("Path from x to node is:" + i + " ");
		}
	}

}
