package linkedlistimplementation;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree<Value extends Comparable<Value>> {

	private Node<Value> root;

	public void insert(Value value) {
		Node<Value> newNode = new Node<>(value);
		if (root == null) {
			root = newNode;
			return;
		}
		Node<Value> currentNode = root;
		while (true) {
			if (value.equals(currentNode.value)) {
				return;
			}
			if (value.compareTo(currentNode.value) < 0) {
				if (currentNode.left == null) {
					currentNode.left = newNode;
					return;
				}
				currentNode = currentNode.left;
			} else {
				if (currentNode.right == null) {
					currentNode.right = newNode;
					return;
				}
				currentNode = currentNode.right;
			}
		}
	}

	public boolean find(Value value) {
		if (root == null)
			return false;
		Node<Value> currentNode = root;
		while (true) {
			if (value.equals(currentNode.value))
				return true;
			if (value.compareTo(currentNode.value) < 0) {
				if (currentNode.left == null)
					return false;
				currentNode = currentNode.left;
			} else {
				if (currentNode.right == null)
					return false;
				currentNode = currentNode.right;
			}
		}
	}

	public List<Value> DFSInOrder() {
		List<Value> values = new LinkedList<>();
		if (root != null)
			DFSInOrder(values, root);
		return values;
	}

	private void DFSInOrder(List<Value> values, Node<Value> node) {
		if (node.left != null)
			DFSInOrder(values, node.left);
		values.add(node.value);
		if (node.right != null)
			DFSInOrder(values, node.right);
	}

}