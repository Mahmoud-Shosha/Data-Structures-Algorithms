package heapsort;

public class HeapSortProblem {

	// Time Complexity is O(nlogn)
	public static <T extends Comparable<T>> void heapSort(T[] array) {
		int length = array.length;
		// Building a max-heap starting at last non-leaf (parent of last node)
		// By heapifying all parent nodes
		for (int i = length / 2 - 1; i >= 0; i--) {
			heapify(array, length, i);
		}
		// From last node to root node
		for (int i = length - 1; i > 0; i--) {
			swap(array, 0, i);
			// Heapify root element recursively with new heap size
			heapify(array, i, 0);
		}
	}

	public static <T extends Comparable<T>> void heapify(T[] array, int length, int index) {
		int largest = index;
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		if (left < length && array[left].compareTo(array[largest]) > 0)
			largest = left;
		if (right < length && array[right].compareTo(array[largest]) > 0)
			largest = right;
		if (largest != index) {
			swap(array, index, largest);
			heapify(array, length, largest);
		}
	}

	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
