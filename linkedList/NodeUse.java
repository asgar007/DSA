package linkedList;

import java.util.Scanner;

public class NodeUse {
	
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		//create link
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}
	
	public static Node<Integer> takeInput(){     //O(n)
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				//make this node as head node and tail node
				head = currentNode;             
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = tail.next;
			}
			
			data = sc.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insertNode(Node<Integer> head, int elem, int pos) { 
		Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
		if(pos == 0) {
			nodeToBeInserted.next = head;
			//head = nodeToBeInserted;
			return nodeToBeInserted;
		}
		else {
			Node<Integer> prev = head;
			int count = 0;
			while(count < pos-1 && prev!=null) {   // prev!=null -> for null pointer exception coz pos > LL length
				count++;
				prev = prev.next;
			}
			if(prev!=null) {
				//make b4 break
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
		}
		return head;
	}
	
	private static Node<Integer> insertRecursively(Node<Integer> head, int elem, int pos) {
		if(head == null && pos > 0)// pos > 0 condition for if empty LL passed and pos = 0 then it should work properly
			return head;
		
		if(pos == 0) {
			Node<Integer> nodeToBeInserted = new Node<Integer>(elem);
			nodeToBeInserted.next = head;
			//head = nodeToBeInserted;
			return nodeToBeInserted;
		}
		else {
			Node<Integer> smallHead = insertRecursively(head.next, elem, pos-1);
			head.next = smallHead;// these  lines is imp coz you need to connect the original head in LL as well
			return head;
		}
	} 
	
	public static Node<Integer> deleteNode(Node<Integer> head, int pos){
		
		if(pos == 0 && head != null) {// for head node deletion
			head = head.next;
			return head;
		}
		else {
			Node<Integer> pre = head;
			int count = 0;
			while(count < pos - 1 && pre != null) {
				count++;
				pre = pre.next;
			}
			if(pre != null && pre.next != null)
				pre.next = pre.next.next;
		}
		return head;
	}
	
	private static Node<Integer> deleteNodeRecursively(Node<Integer> head, int pos) {
		if(pos == 0) {
			head = head.next;
			return head;
		}
		else {
			Node<Integer> smallNode = deleteNodeRecursively(head.next, pos-1);
			head.next = smallNode;
			return head;
		}	
	}
	
	private static Node<Integer> removeDuplicacy(Node<Integer> head) {
		Node<Integer> t1 = head;
        Node<Integer> t2 = head.next;
        while(t2.next != null){
            if(t1.data == t2.data){
                t2 = t2.next;
                continue;
            }
            t1.next = t2;
            t1 = t2;
            t2 = t2.next;
        }
        if(t2.next == null){
        	t1.next = null;
        }
        return head;
	}
	
	//print utilty
	private static void printLinkedList(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		/* printing recursively
		 * if(head==null)
		 * 		return head;
		 * System.out.print(head.data+" ");
		 *  printLinkedList(head.next);
		 */
		
	}
	
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	
	private static Node<Integer> reverseRecursively(Node<Integer> head) {
		if(head == null)
			return null;
		if(head.next == null)
			return head;
		else {
			Node<Integer> smallReverseNode = reverseRecursively(head.next);
			head.next.next = head; // these  lines is very imp.
			head.next = null;
			return smallReverseNode;
		}
	}
	
	private static int findMid(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null && fast.next.next != null) { // note && works not || due to null pointer exception
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	private static Node<Integer> mergeToSortedLL(Node<Integer> head1, Node<Integer> head2) {
		
		if(head1 == null)
            return head2;
		
        if(head2 == null)
            return head1;
        
        Node<Integer> t1 = head1;
        Node<Integer> t2 = head2;
        Node<Integer> head;
        Node<Integer> tail;
        
        if(t1.data < t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }
        else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while(t1 != null && t2 !=null){
            if(t2.data < t1.data){
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
            else{
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            }
        }
        //one list is over append other left node
        if(t1 == null){
            tail.next = t2;
        }
        else
            tail.next = t1;
        
        return head;
	}
	
	public static void main(String[] args) {
//		Node<Integer> node = new Node<>(10);
//		System.out.println(node.data);
//		System.out.println(node.next);
//		Node<Integer> head = takeInput();   //createLinkedList();
//		increment(head);
//		head = insertNode(head, 80, 0);
//		head = insertRecursively(head,80,2);
//		head = deleteNode(head, 2);
//		head = deleteNodeRecursively(head,2);
//		head = removeDuplicacy(head);
//		head = reverseRecursively(head);
//		int data = findMid(head);
//		System.out.println(data);
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head = mergeToSortedLL(head1,head2);
		printLinkedList(head);
	}


}
