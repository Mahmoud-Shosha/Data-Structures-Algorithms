package quicksort;

import java.util.Arrays;

public class QuickSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		QuickSortProblem.quickSort(intArr);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		QuickSortProblem.quickSort(StringArr);
		System.out.println(Arrays.toString(StringArr));
	}

}
