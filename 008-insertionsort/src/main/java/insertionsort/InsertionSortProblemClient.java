package insertionsort;

import java.util.Arrays;

public class InsertionSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		InsertionSortProblem.insertionSort(intArr);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		InsertionSortProblem.insertionSort(StringArr);
		System.out.println(Arrays.toString(StringArr));
	}

}
