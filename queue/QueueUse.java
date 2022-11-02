package queue;

public class QueueUse {
	public static void main(String[] args) throws QueueEmptyException, QueueFullException {
		QueueUsingArray queue = new QueueUsingArray();
		int arr[] = {1,5,9,7};
		for(int elem : arr) {
			queue.enqueue(elem);
		}
//		int ans = queue.dequeue();
//		int ans1 = queue.size();
		System.out.println(queue.size());
	}
}
