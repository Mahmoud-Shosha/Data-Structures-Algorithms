package binarysearch;

public class BinarySearchProblemClient {

	public static void main(String[] args) {
		System.out.printf("binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 15) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 15));
		System.out.printf("binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 28) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 28));
		System.out.printf("binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 30) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 30));
		System.out.printf("binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 999) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 5, 6, 9, 13, 15, 28, 30 }, 999));
		System.out.printf("binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 10) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 10));
		System.out.printf("binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 3) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 3));
		System.out.printf("binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 2) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 2));
		System.out.printf("binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 0) ==> %s\n",
				BinarySearchProblem.binarySearch(new Integer[] { 2, 3, 4, 10, 40 }, 0));
		System.out.printf("binarySearch(new String[] {\"Hello\", \"Hiii\", \"hello\"}, \"hello\") ==> %s\n",
				BinarySearchProblem.binarySearch(new String[] { "Hello", "Hiii", "hello" }, "hello"));
	}

}
