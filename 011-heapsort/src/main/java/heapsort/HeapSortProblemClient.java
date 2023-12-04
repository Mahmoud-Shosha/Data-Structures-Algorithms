package heapsort;

import java.util.Arrays;

public class HeapSortProblemClient {

	public static void main(String[] args) {
		Integer[] intArr = new Integer[] { 37, 45, 29, 8, 12, 88, -3 };
		HeapSortProblem.heapSort(intArr);
		System.out.println(Arrays.toString(intArr));
		String[] StringArr = new String[] { "hello", "Hello", "Hai!" };
		HeapSortProblem.heapSort(StringArr);
		System.out.println(Arrays.toString(StringArr));
	}

}
