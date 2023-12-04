package selectionsort;

import java.util.Arrays;

public class SelectionSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		SelectionSortProblem.selectionSort(intArr);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		SelectionSortProblem.selectionSort(StringArr);
		System.out.println(Arrays.toString(StringArr));
	}

}
