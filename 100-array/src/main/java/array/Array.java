package array;

import java.util.Arrays;

public class Array {

	private static String[] arr = { "Sami", "Ali", "Ahmed", "Zombie", "Mahmoud" };

	// Time Complexity: O(N)
	public static void traverse() {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d: %s \n", i, arr[i]);
		}
	}

	// Time Complexity: O(N)
	public static void insert(int index, String item) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = item;
	}

	// Time Complexity: O(N)
	public static void delete(int index) {
		for (int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
			arr[i + 1] = null;
		}
	}

	// Time Complexity: O(1)
	public static void update(int index, String item) {
		arr[index] = item;
	}

	// Time Complexity: O(N)
	public static int search(String item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public static void printArray() {
		System.out.println(Arrays.toString(arr));
	}

}
