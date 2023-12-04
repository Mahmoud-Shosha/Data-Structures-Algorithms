package linearsearch;

public class LinearSearchProblem {

	// Time Complexity is O(n)
	public static <T> int linearSearch(T[] arr, T key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key))
				return i;
		}
		return -1;
	}

}
