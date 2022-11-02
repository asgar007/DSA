package binaryTrees;

import java.util.Scanner;

public class BSTuse {
	public static void main(String[] args) {
		BST b = new BST();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println("enter element: ");
			int elem = sc.nextInt();
			b.insert(elem);
		}
//		b.insert(5);
//		b.insert(0);
//		b.insert(8);
//		b.insert(3);
		b.printTree();
		System.out.println(b.isPresent(4));
	}
}
