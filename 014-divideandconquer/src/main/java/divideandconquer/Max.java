package divideandconquer;

public class Max {

	public static int max(int[] arr) {
		if (arr.length == 0)
			return -1;
		return max(arr, 0);
	}

	private static int max(int[] arr, int index) {
		// The base case
		if (index == arr.length - 1) {
			return arr[index];
		}
		// The recursive case
		int max = max(arr, index + 1);
		if (arr[index] > max) {
			return arr[index];
		} else {
			return max;
		}
	}

}
