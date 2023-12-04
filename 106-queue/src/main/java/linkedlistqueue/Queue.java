package linkedlistqueue;

public class Queue<Value> {

	private Node<Value> first;
	private Node<Value> last;
	private int size;

	public Queue() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public int enqueue(Value value) {
		Node<Value> newNode = new Node<Value>(value);
		if (first == null) {
			first = last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		size++;
		return size;
	}

	public Value dequeue() {
		if (first == null)
			return null;
		Node<Value> poppedNode = first;
		if (size == 1) {
			first = last = null;
		} else {
			first = first.next;
		}
		poppedNode.next = null;
		size--;
		return poppedNode.value;
	}

	@Override
	public String toString() {
		Node<Value> tempNode = first;
		StringBuilder result = new StringBuilder("[");
		while (tempNode != null) {
			result.append(tempNode.value);
			result.append(", ");
			tempNode = tempNode.next;
		}
		if (result.length() >= 2)
			result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}

}