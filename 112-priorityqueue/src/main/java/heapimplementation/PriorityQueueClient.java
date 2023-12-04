package heapimplementation;

public class PriorityQueueClient {

	public static void main(String[] args) {

		PriorityQueue<Customer> pq = new PriorityQueue<>();
		pq.enqueue(new Customer("Ahmed", 5));
		pq.enqueue(new Customer("Sami", 55));
		pq.enqueue(new Customer("Mahmoud", 1));
		pq.enqueue(new Customer("Fadi", 5));
		pq.enqueue(new Customer("Alex", 2));
		pq.enqueue(new Customer("Ranz", 1));
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);
		System.out.println(pq.dequeue());
		System.out.println(pq);

	}

}