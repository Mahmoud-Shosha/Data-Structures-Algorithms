package bubblesort;

public class BubbleSortProblem {

	// Time Complexity is O(n^2)
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	// Time Complexity is O(n^2)
	public static <T extends Comparable<T>> void optimizedBubbleSort(T[] arr) {
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					swap(arr, j, j + 1);
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
	}

	public static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
