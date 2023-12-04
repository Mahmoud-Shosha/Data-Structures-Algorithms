package selectionsort;

public class SelectionSortProblem {

	// Time Complexity is O(n^2)
	public static <T extends Comparable<T>> void selectionSort(T[] arr) {
		int min;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			if (min != i)
				swap(arr, i, min);
		}
	}

	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
