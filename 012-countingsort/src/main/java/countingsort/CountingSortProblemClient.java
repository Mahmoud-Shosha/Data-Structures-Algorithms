package countingsort;

import java.util.Arrays;

public class CountingSortProblemClient {

	public static void main(String[] args) {
		int[] intArr = new int[] { 37, 45, 29, 8, 12, 88, 3 };
		CountingSortProblem.countingSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37, 45, 29, 8, 12, 88 };
		CountingSortProblem.countingSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37, 45 };
		CountingSortProblem.countingSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] { 37 };
		CountingSortProblem.countingSort(intArr);
		System.out.println(Arrays.toString(intArr));
		intArr = new int[] {};
		CountingSortProblem.countingSort(intArr);
		System.out.println(Arrays.toString(intArr));
	}

}
