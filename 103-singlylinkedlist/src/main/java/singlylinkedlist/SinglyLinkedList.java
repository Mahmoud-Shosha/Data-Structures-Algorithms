package singlylinkedlist;

public class SinglyLinkedList<Value> {

	private Node<Value> head;
	private Node<Value> tail;
	private int length;

	public SinglyLinkedList() {
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
			tail = newNode;
		}
		length++;
	}

	public Value pop() {
		if (head == null)
			return null;
		Node<Value> temp = head;
		Node<Value> newTail = head;
		while (temp.next != null) {
			newTail = temp;
			temp = temp.next;
		}
		newTail.next = null;
		tail = newTail;
		length--;
		if (length == 0) {
			head = tail = null;
		}
		return temp.value;
	}

	public Value shift() {
		if (head == null)
			return null;
		Node<Value> oldHead = head;
		head = head.next;
		length--;
		if (length == 0) {
			head = tail = null;
		}
		return oldHead.value;
	}

	public void unshift(Value value) {
		Node<Value> newNode = new Node<Value>(value);
		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	private Node<Value> getNode(int index) {
		if (index < 0 || index >= length)
			return null;
		Node<Value> currentNode = head;
		int counter = 0;
		while (index > counter) {
			currentNode = currentNode.next;
			counter++;
		}
		return currentNode;
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
			newNode.next = preNode.next;
			preNode.next = newNode;
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
			Node<Value> preNode = getNode(index - 1);
			Node<Value> removed = preNode.next;
			preNode.next = removed.next;
			length--;
			return removed.value;
		}
	}

	public void reverse() {
		Node<Value> current = head;
		head = tail;
		tail = current;
		Node<Value> pre = null;
		Node<Value> next;
		for (int i = 0; i < length; i++) {
			next = current.next;
			current.next = pre;
			pre = current;
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