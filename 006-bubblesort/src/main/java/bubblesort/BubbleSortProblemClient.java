package bubblesort;

import java.util.Arrays;

public class BubbleSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		BubbleSortProblem.optimizedBubbleSort(intArr);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		BubbleSortProblem.optimizedBubbleSort(StringArr);
		System.out.println(Arrays.toString(StringArr));
	}

}
