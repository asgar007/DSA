package priorityQueue;

public class Driver {
	public static void main(String[] args) throws PriorityQueueException {
		Priority_Queue<String> pq = new Priority_Queue<String>();
		pq.insert("Farhan", 3);
		pq.insert("Rehan", 4);
		pq.insert("Arsan", 5);
		pq.insert("Rahmat", 2);
		pq.insert("Afsari", 1);
		

		System.out.println(pq.getMin());

	}
}
