package mergesort;

public class MergeSortProblem {

	// Time Complexity is O(nlogn)
	public static <T> void mergeSort(Comparable<T>[] array, int start, int end) {
		if (start >= end)
			return;
		int mid = (start + end) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, mid, end);
	}

	@SuppressWarnings("unchecked")
	public static <T> void merge(Comparable<T>[] arr, int start, int mid, int end) {
		// Create arr1 ← A[start..mid] and arr2 ← A[mid+1..end]
		int m1 = mid - start + 1;
		int m2 = end - mid;
		Comparable<T>[] arr1 = new Comparable[m1];
		Comparable<T>[] arr2 = new Comparable[m2];
		for (int i = 0; i < m1; i++)
			arr1[i] = arr[start + i];
		for (int j = 0; j < m2; j++)
			arr2[j] = arr[mid + 1 + j];
		// Merge arr1 and arr2 into arr
		int i = 0, j = 0, k = start;
		while (i < m1 && j < m2) {
			if (arr1[i].compareTo((T) arr2[j]) <= 0) {
				arr[k++] = arr1[i++];
			} else {
				arr[k++] = arr2[j++];
			}
		}
		while (i < m1) {
			arr[k++] = arr1[i++];
		}
		while (j < m2) {
			arr[k++] = arr2[j++];
		}
	}

}
