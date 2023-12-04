package doublylinkedlist;

public class DoublyLinkedList<Value> {

	private Node<Value> head;
	private Node<Value> tail;
	private int length;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public void push(Value value) {
		Node<Value> newNode = new Node<Value>(value);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prv = tail;
			tail = newNode;
		}
		length++;
	}

	public Value pop() {
		if (head == null)
			return null;
		Node<Value> poppedNode = tail;
		if (length == 1) {
			head = tail = null;
		} else {
			tail = tail.prv;
			tail.next = null;
			poppedNode.prv = null;
		}
		length--;
		return poppedNode.value;
	}

	public Value shift() {
		if (head == null)
			return null;
		Node<Value> oldHead = head;
		if (length == 1) {
			head = tail = null;
		} else {
			head = head.next;
			head.prv = null;
			oldHead.next = null;
		}
		length--;
		return oldHead.value;
	}

	public void unshift(Value value) {
		Node<Value> newNode = new Node<Value>(value);
		if (head == null) {
			head = tail = newNode;
		} else {
			head.prv = newNode;
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	private Node<Value> getNode(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index <= length / 2) {
			Node<Value> currentNode = head;
			int counter = 0;
			while (index > counter) {
				currentNode = currentNode.next;
				counter++;
			}
			return currentNode;
		} else {
			Node<Value> currentNode = tail;
			int counter = length - 1;
			while (index < counter) {
				currentNode = currentNode.prv;
				counter--;
			}
			return currentNode;
		}
	}

	public Value get(int index) {
		Node<Value> currentNode = getNode(index);
		if (currentNode == null)
			return null;
		else
			return currentNode.value;
	}

	public boolean set(int index, Value value) {
		Node<Value> currentNode = getNode(index);
		if (currentNode == null) {
			return false;
		} else {
			currentNode.value = value;
			return true;
		}
	}

	public void insert(int index, Value value) {
		if (index < 0 || index > length)
			return;
		if (index == length) {
			push(value);
		} else if (index == 0) {
			unshift(value);
		} else {
			Node<Value> newNode = new Node<Value>(value);
			Node<Value> preNode = getNode(index - 1);
			Node<Value> nextNode = preNode.next;
			preNode.next = newNode;
			newNode.prv = preNode;
			newNode.next = nextNode;
			nextNode.prv = newNode;
			length++;
		}
	}

	public Value remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == length - 1) {
			return pop();
		} else if (index == 0) {
			return shift();
		} else {
			Node<Value> removed = getNode(index);
			removed.prv.next = removed.next;
			removed.next.prv = removed.prv;
			removed.next = null;
			removed.prv = null;
			length--;
			return removed.value;
		}
	}

	public void reverse() {
		Node<Value> current = head;
		head = tail;
		tail = current;
		Node<Value> next;
		for (int i = 0; i < length; i++) {
			next = current.next;
			current.next = current.prv;
			current.prv = next;
			current = next;
		}
	}

	public int search(Value value) {
		Node<Value> currentNode = head;
		int counter = 0;
		while (currentNode != null) {
			if (currentNode.value.equals(value)) {
				return counter;
			}
			currentNode = currentNode.next;
			counter++;
		}
		return -1;
	}

	@Override
	public String toString() {
		Node<Value> tempNode = head;
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