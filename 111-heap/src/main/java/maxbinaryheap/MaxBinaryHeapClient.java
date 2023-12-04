package maxbinaryheap;

public class MaxBinaryHeapClient {

	public static void main(String[] args) {

		MaxBinaryHeap<Integer> h = new MaxBinaryHeap<>();

		System.out.println(h);
		System.out.println(h.extractMax());
		h.insert(5);
		System.out.println(h);
		System.out.println(h.extractMax());
		h.insert(5);
		h.insert(8);
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println("------------------------------");

		System.out.println(h);
		h.insert(0);
		System.out.println(h);
		h.insert(-555);
		System.out.println(h);
		h.insert(9);
		System.out.println(h);
		h.insert(8);
		System.out.println(h);
		h.insert(888);
		System.out.println(h);
		h.insert(7);
		System.out.println(h);
		h.insert(7);
		System.out.println(h);
		h.insert(999);
		System.out.println(h);
		System.out.println("------------------------------");

		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());
		System.out.println(h);
		System.out.println(h.extractMax());

	}

}