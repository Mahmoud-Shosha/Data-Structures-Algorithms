package linkedliststack;

public class Stack<Value> {

	private Node<Value> first;
	private int size;

	public Stack() {
		this.first = null;
		this.size = 0;
	}

	public int push(Value value) {
		Node<Value> newNode = new Node<Value>(value);
		if (first == null) {
			first = newNode;
		} else {
			newNode.next = first;
			first = newNode;
		}
		size++;
		return size;
	}

	public Value pop() {
		if (first == null)
			return null;
		Node<Value> poppedNode = first;
		if (size == 1) {
			first = null;
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