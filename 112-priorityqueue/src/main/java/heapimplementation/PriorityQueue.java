package heapimplementation;

public class PriorityQueue<Value extends Comparable<Value>> {

	private MaxBinaryHeap<Value> heap = new MaxBinaryHeap<Value>();

	public void enqueue(Value value) {
		heap.insert(value);
	}

	public Value dequeue() {
		return heap.extractMax();
	}

	@Override
	public String toString() {
		return heap.toString();
	}
}
