package arrayimplementation;

import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree<Value extends Comparable<Value>> {

	private Value[] tree;
	private static final int DEFAULT_CAPACITY = 100;

	public BinarySearchTree() {
		this(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public BinarySearchTree(int capacity) {
		tree = (Value[]) new Comparable<?>[capacity];
	}

	public void insert(Value value) {
		if (tree[0] == null) {
			tree[0] = value;
			return;
		}
		int index = 0;
		while (true) {
			if (value.equals(tree[index])) {
				return;
			}
			if (value.compareTo(tree[index]) < 0) {
				if (tree[index * 2 + 1] == null) {
					tree[index * 2 + 1] = value;
					return;
				}
				index = index * 2 + 1;
			} else {
				if (tree[index * 2 + 2] == null) {
					tree[index * 2 + 2] = value;
					return;
				}
				index = index * 2 + 2;
			}
		}
	}

	public boolean find(Value value) {
		if (tree[0] == null)
			return false;
		int index = 0;
		while (true) {
			if (value.equals(tree[index]))
				return true;
			if (value.compareTo(tree[index]) < 0) {
				if (tree[index * 2 + 1] == null)
					return false;
				index = index * 2 + 1;
			} else {
				if (tree[index * 2 + 2] == null)
					return false;
				index = index * 2 + 2;
			}
		}
	}

	public List<Value> DFSInOrder() {
		List<Value> values = new LinkedList<>();
		if (tree[0] != null)
			DFSInOrder(values, 0);
		return values;
	}

	private void DFSInOrder(List<Value> values, int index) {
		if (tree[2 * index + 1] != null)
			DFSInOrder(values, 2 * index + 1);
		values.add(tree[index]);
		if (tree[2 * index + 2] != null)
			DFSInOrder(values, 2 * index + 2);
	}

}