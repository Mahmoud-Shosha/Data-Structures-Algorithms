package dynamicarray;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		DynamicArray<Integer> numbers = new DynamicArray<>(3);
		numbers.insert(10);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		System.out.println(Arrays.toString(numbers.toArray()));
	}

}
