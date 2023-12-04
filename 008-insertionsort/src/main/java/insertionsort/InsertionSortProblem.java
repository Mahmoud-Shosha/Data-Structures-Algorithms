package insertionsort;

public class InsertionSortProblem {

	// Time Complexity is O(n^2)
	public static <T extends Comparable<T>> void insertionSort(T[] arr) {
		T currentVal;
		int j;
		for (int i = 1; i < arr.length; i++) {
			currentVal = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(currentVal) > 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentVal;
		}
	}


}
