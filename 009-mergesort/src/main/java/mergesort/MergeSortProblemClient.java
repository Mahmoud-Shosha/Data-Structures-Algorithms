package mergesort;

import java.util.Arrays;

public class MergeSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		MergeSortProblem.mergeSort(intArr, 0, intArr.length - 1);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		MergeSortProblem.mergeSort(StringArr, 0, StringArr.length - 1);
		System.out.println(Arrays.toString(StringArr));
	}

}
