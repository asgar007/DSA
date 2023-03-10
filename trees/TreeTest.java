package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {
	
	public static void printPostOrder(TreeNode<Integer> root){
		if(root == null) // remember its not base case, rather a secial case 
			return; 
		//  doing it recursively
		for(TreeNode<Integer> child : root.children){ // base case is being taken care in loop itself
			printPostOrder(child);
		}
		System.out.print(root.data + " ");
	}
	
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
		if(root == null)
			return 0;
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		int leaves = 0;
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0; i<size; i++){
				TreeNode<Integer> node = queue.poll();
				if(node.children.size() == 0){
					leaves++;
				}
				for(TreeNode<Integer> child : node.children){
					queue.offer(child);
				}
			}
		}
		return leaves;
	}
	
	public static int getHeight(TreeNode<Integer> root){
		 if(root == null)
		 	return 0;
		 Queue<TreeNode<Integer>> queue = new LinkedList<>();
		 queue.offer(root);
		 int height = 0;
		 while(!queue.isEmpty()){
			int size = queue.size();
			height++;
			 for(int i=0; i<size; i++){
				 TreeNode<Integer> node = queue.poll();
				 for(TreeNode<Integer> child : node.children){
					 queue.offer(child);
				 }
			 }
		 }
		 return height;
	}
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		Queue<TreeNode<Integer>> PendingNode = new LinkedList<>();
		PendingNode.offer(root);
		int count = 0;
		while(!PendingNode.isEmpty()){
			int size = PendingNode.size();
			for(int i=0; i<size; i++){
				TreeNode<Integer> node = PendingNode.poll();
				if (node.data > x)
					count++;
				for(TreeNode<Integer> child : node.children){
					PendingNode.offer(child);
				}
			}
		}
		return count;
	}
	
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()){
			int size = pendingNodes.size();
			for(int i=0; i<size; i++){
				TreeNode<Integer> node = pendingNodes.poll();
				System.out.print(node.data + " ");
				for(TreeNode<Integer> child : node.children ){
					pendingNodes.offer(child);
				}
			}
			System.out.println();
		}
	}
	
	public static int sumOfAllNodeHelper(TreeNode<Integer> root, int sum){
		sum = root.data;
		for(int i=0; i<root.children.size(); i++){
			TreeNode<Integer> child = root.children.get(i);
			sum += sumOfAllNodeHelper(child, sum);
		}
		return sum;
	}
	public static int sumOfAllNode(TreeNode<Integer> root){
		return sumOfAllNodeHelper(root, 0);
	}
	
	public static int numberOfNodes(TreeNode<Integer> root, int count) {
		for(int i=0; i<root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			count = 1 + numberOfNodes(child, count);
		}
		return count;
	}
	
	public static TreeNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		Queue<TreeNode<Integer>> pendingNode = new LinkedList<TreeNode<Integer>>();
		System.out.println("Enter the root data: ");
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNode.add(root);
		while(!pendingNode.isEmpty()) {
			TreeNode<Integer> front = pendingNode.remove();
			System.out.println("Enter the No of Children for: " + front.data);
			int numChild = sc.nextInt();
			for(int i=0; i<numChild; i++) {
				System.out.println("Enter the " + i + "th child of :" + front.data);
				int childData = sc.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
				front.children.add(childNode);
				pendingNode.add(childNode);
			}
		}
		return root;
	}
	
	public static void printPreOrderBetter(TreeNode<Integer> root) {
//		its not base case rather a special case, base case is being taken care in for loop itself
		if(root == null)
			return;
		System.out.print(root.data + ":");
//		b4 calling children print its children first
		for(int i=0; i<root.children.size(); i++) {
			System.out.print(root.children.get(i).data + " ");
		}
		System.out.println();
		for(int i=0; i<root.children.size(); i++) {
			TreeNode<Integer> child= root.children.get(i);
			printPreOrderBetter(child);			
		}
	}
	
	public static void printPreOrder(TreeNode<Integer> root) {
//		its not base case rather a special case, base case is being taken care in for loop itself
		if(root == null)
			return;
		System.out.print(root.data + " ");
		for(int i=0; i<root.children.size(); i++) {
			TreeNode<Integer> child= root.children.get(i);
			printPreOrder(child);			
		}
	}
	
	public static void main(String[] args) {
//		TreeNode<Integer> root = new TreeNode<Integer>(0);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(1);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
//		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
////		connect all children
//		root.chidren.add(node1);
//		root.chidren.add(node2);
//		root.chidren.add(node3);
//		node2.chidren.add(node4);
//		node2.chidren.add(node5);
		TreeNode<Integer> root = takeInput();
		printPreOrderBetter(root);
		System.out.println(numberOfNodes(root, 0));
	}
}
