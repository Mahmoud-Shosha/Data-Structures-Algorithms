package quicksort;

public class QuickSortProblem {

	// Time Complexity is O(nlogn)
	public static <T extends Comparable<T>> void quickSort(T[] list) {
		quickSortHelper(list, 0, list.length - 1);
	}

	public static <T extends Comparable<T>> void quickSortHelper(T[] array, int start, int end) {
		if (start < end) {
			int pivot = pivot(array, start, end);
			quickSortHelper(array, start, pivot - 1);
			quickSortHelper(array, pivot + 1, end);
		}
	}

	public static <T extends Comparable<T>> int pivot(T[] array, int start, int end) {
		T pivot = array[end];
		int swapIndex = start;
		for (int i = start; i < end; i++) {
			if (array[i].compareTo(pivot) <= 0) {
				swap(array, swapIndex, i);
				swapIndex++;
			}
		}
		swap(array, swapIndex, end);
		return swapIndex;
	}

	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
