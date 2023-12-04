package doublylinkedlist;

class Node<Value> {

	Value value;
	Node<Value> next;
	Node<Value> prv;

	Node(Value value) {
		this.value = value;
		this.next = null;
		this.prv = null;
	}

}
