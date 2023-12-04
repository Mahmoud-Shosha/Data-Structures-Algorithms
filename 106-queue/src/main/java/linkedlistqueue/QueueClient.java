package linkedlistqueue;

public class QueueClient {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		System.out.println("------------- enqueue method -------------");
		System.out.println(queue);
		System.out.println(queue.enqueue(25));
		System.out.println(queue);
		System.out.println(queue.enqueue(13));
		System.out.println(queue.enqueue(109));
		System.out.println(queue.enqueue(-2225));
		System.out.println(queue);

		queue = new Queue<Integer>();
		System.out.println("------------- dequeue method -------------");
		System.out.println(queue.enqueue(13));
		System.out.println(queue.enqueue(109));
		System.out.println(queue.enqueue(-2225));
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue);
		System.out.println(queue.enqueue(55598));
		System.out.println(queue);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue);
	}

}