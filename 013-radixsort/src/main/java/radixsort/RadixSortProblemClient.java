package radixsort;

import java.util.Arrays;

public class RadixSortProblemClient {

	public static void main(String[] args) {
		int[] intArr = new int[] { 37, 45, 29, 8, 12, 88, 3 };
		RadixSortProblem.radixSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37, 45, 29, 8, 12, 88 };
		RadixSortProblem.radixSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37, 45 };
		RadixSortProblem.radixSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37 };
		RadixSortProblem.radixSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] {};
		RadixSortProblem.radixSort(intArr);
		System.out.println(Arrays.toString(intArr));
	}

}
