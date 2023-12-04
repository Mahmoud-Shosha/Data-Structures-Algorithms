package radixsort;

public class RadixSortProblem {

	// Time Complexity is O(kn)
	public static void radixSort(int[] array) {
		// Get the max element in the array
		int max = max(array);
		// Call the countingSort for each digit in max
		for (int div = 1; max / div > 0; div *= 10) {
			countingSort(array, div);
		}
	}

	private static void countingSort(int[] array, int div) {
		// Create the count array
		int[] count = new int[10];
		// Count the frequency of each element ith digit
		for (int i = 0; i < array.length; i++) {
			count[array[i] / div % 10]++;
		}
		// Make count array contains the actual position
		for (int i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}
		// Get the elements sorted in a temp array based on ith digit
		int[] temp = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {
			temp[count[array[i] / div % 10] - 1] = array[i];
			count[array[i] / div % 10]--;
		}
		// Copy temp to array
		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}
	}

	private static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

}
