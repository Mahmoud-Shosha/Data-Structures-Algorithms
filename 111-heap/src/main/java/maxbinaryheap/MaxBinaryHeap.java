package maxbinaryheap;

import java.util.ArrayList;
import java.util.List;

public class MaxBinaryHeap<Value extends Comparable<Value>> {

	private List<Value> values = new ArrayList<>();

	public void insert(Value value) {
		values.add(value);
		heapifyUp(values.size() - 1);
	}

	private void heapifyUp(int index) {
		// As long as the node is greater than its parent
		while (values.get(index).compareTo(values.get(parent(index))) > 0) {
			// Swap
			swap(index, parent(index));
			index = parent(index);
		}
	}

	public Value extractMax() {
		if (values.size() == 0) {
			return null;
		} else if (values.size() == 1) {
			return values.remove(0);
		} else {
			Value max = values.get(0);
			values.set(0, values.remove(values.size() - 1));
			heapifyDown(0);
			return max;
		}
	}

	private void heapifyDown(int index) {
		if (index >= values.size() / 2)
			return;
		int maxChildIndex = getMaxBetweenTwoChildNodes(leftChild(index), rightChild(index));
		if (maxChildIndex != -1 && values.get(index).compareTo(values.get(maxChildIndex)) < 0) {
			swap(index, maxChildIndex);
			heapifyDown(maxChildIndex);
		}
	}

	private int getMaxBetweenTwoChildNodes(int leftChildIndex, int rightChildIndex) {
		int max;
		if (leftChildIndex < values.size() && rightChildIndex < values.size()) {
			if (values.get(leftChildIndex).compareTo(values.get(rightChildIndex)) > 0) {
				max = leftChildIndex;
			} else {
				max = rightChildIndex;
			}
		} else if (leftChildIndex < values.size()) {
			max = leftChildIndex;
		} else if (rightChildIndex < values.size()) {
			max = rightChildIndex;
		} else {
			max = -1;
		}
		return max;
	}

	private int parent(int index) {
		return (index - 1) / 2;
	}

	private int leftChild(int index) {
		return (2 * index) + 1;
	}

	private int rightChild(int index) {
		return (2 * index) + 2;
	}

	private void swap(int index1, int index2) {
		Value temp = values.get(index1);
		values.set(index1, values.get(index2));
		values.set(index2, temp);
	}

	@Override
	public String toString() {
		return values.toString();
	}

}