package binarysearch;

public class BinarySearchProblem {

	// Time Complexity is O(log(n))
	public static <T> int binarySearch(Comparable<T>[] sortedArr, T key) {
		int left = 0;
		int right = sortedArr.length - 1;
		int middle;
		while (left <= right) {
			middle = (right + left) / 2; // Average
			System.out.println(left + " - " + middle + " - " + right);
			if (sortedArr[middle].equals(key))
				return middle;
			else if (sortedArr[middle].compareTo(key) > 0)
				right = middle - 1;
			else
				left = middle + 1;
		}
		return -1;
	}

}
