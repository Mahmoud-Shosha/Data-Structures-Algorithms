package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<Value> {

	private Node<Value> root;

	public void insert(Value value) {
		Node<Value> newNode = new Node<>(value);
		if (root == null) {
			root = newNode;
		} else {
			Queue<Node<Value>> queue = new LinkedList<>();
			queue.add(root);
			Node<Value> currentNode;
			while (!queue.isEmpty()) {
				currentNode = queue.remove();
				if (currentNode.left != null) {
					queue.add(currentNode.left);
				} else {
					currentNode.left = newNode;
					break;
				}
				if (currentNode.right != null) {
					queue.add(currentNode.right);
				} else {
					currentNode.right = newNode;
					break;
				}
			}

		}
	}

	public List<Value> breadthFirtSearch() {
		List<Value> values = new LinkedList<>();
		Queue<Node<Value>> queue = new LinkedList<>();
		queue.add(root);
		Node<Value> currentNode;
		if (root != null) {
			while (!queue.isEmpty()) {
				currentNode = queue.remove();
				values.add(currentNode.value);
				if (currentNode.left != null)
					queue.add(currentNode.left);
				if (currentNode.right != null)
					queue.add(currentNode.right);
			}
		}
		return values;
	}

	public List<Value> DFSPreOrder() {
		List<Value> values = new LinkedList<>();
		if (root != null)
			DFSPreOrder(values, root);
		return values;
	}

	private void DFSPreOrder(List<Value> values, Node<Value> node) {
		values.add(node.value);
		if (node.left != null)
			DFSPreOrder(values, node.left);
		if (node.right != null)
			DFSPreOrder(values, node.right);
	}

	public List<Value> DFSPostOrder() {
		List<Value> values = new LinkedList<>();
		if (root != null)
			DFSPostOrder(values, root);
		return values;
	}

	private void DFSPostOrder(List<Value> values, Node<Value> node) {
		if (node.left != null)
			DFSPostOrder(values, node.left);
		if (node.right != null)
			DFSPostOrder(values, node.right);
		values.add(node.value);
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
