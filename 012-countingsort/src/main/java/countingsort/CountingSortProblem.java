package countingsort;

public class CountingSortProblem {

	// Time Complexity is O(2n)
	public static void countingSort(int[] array) {
		if (array.length == 0)
			return;
		int max = max(array);
		int[] count = new int[max + 1];
		// Count frequency of elements in array
		for (int i = 0; i < array.length; ++i) {
			count[array[i]]++;
		}
		// Use count array to sort array
		int lastIndex = 0;
		for (int i = 0; i <= max; ++i) {
			while (count[i]-- > 0) {
				array[lastIndex++] = i;
			}
		}
	}

	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

}
