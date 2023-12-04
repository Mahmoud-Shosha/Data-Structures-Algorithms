package avl;

public class AVLTree<Value extends Comparable<Value>> {

	private Node<Value> root;

	private int getHeight(Node<Value> node) {
		if (node == null)
			return -1;
		return node.height;
	}

	private void updateHeight(Node<Value> node) {
		if (node == null)
			return;
		node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
	}

	private int getBalanceFactor(Node<Value> node) {
		if (node == null)
			return 0;
		return (getHeight(node.left) - getHeight(node.right));
	}

	// Clockwise Rotation
	private Node<Value> LL_rotation(Node<Value> node) {
		Node<Value> child = node.left;
		node.left = child.right;
		child.right = node;
		updateHeight(node);
		updateHeight(child);
		return child;
	}

	// Anti-Clockwise Rotation
	private Node<Value> RR_rotation(Node<Value> node) {
		Node<Value> child = node.right;
		node.right = child.left;
		child.left = node;
		updateHeight(node);
		updateHeight(child);
		return child;
	}

	private Node<Value> insertRecursiveHelper(Node<Value> node, Value value) {
		// BST Insertion Logic
		if (node == null)
			return (new Node<>(value));
		if (value.compareTo(node.value) < 0)
			node.left = insertRecursiveHelper(node.left, value);
		else if (value.compareTo(node.value) > 0)
			node.right = insertRecursiveHelper(node.right, value);
		else
			return node;

		// Balance Factor check
		updateHeight(node);
		int balanceFactor = getBalanceFactor(node);

		// Left heavy or Right heavy
		if (balanceFactor > 1) {
			// LL Rotation Case
			if (getBalanceFactor(node.left) == 1) {
				node = LL_rotation(node);
			}
			// LR Rotation Case
			else {
				node.left = RR_rotation(node.left);
				node = LL_rotation(node);
			}
		} else if (balanceFactor < -1) {
			// RR Rotation Case
			if (getBalanceFactor(node.right) == -1) {
				node = RR_rotation(node);
			}
			// RL Rotation Case
			else {
				node.right = LL_rotation(node.right);
				node = RR_rotation(node);
			}
		}
		return node;
	}

	// AVL Insertion
	public void insert(Value value) {
		root = insertRecursiveHelper(root, value);
	}

	private void preOrderRecusriveHelper(Node<Value> node) {
		if (node != null) {
			System.out.print(node.value + " ");
			preOrderRecusriveHelper(node.left);
			preOrderRecusriveHelper(node.right);
		}
	}

	// Pre-order traversal of the tree
	public void preOrder() {
		preOrderRecusriveHelper(root);
	}

}
