package avl;

public class Node<Value> {

	Value value;
	Node<Value> left;
	Node<Value> right;
	int height;

	public Node(Value value) {
		this.value = value;
		this.height = 0;
	}

	@Override
	public String toString() {
		return "[<" + value + ">, left=" + left + ", right=" + right + "]";
	}

}
