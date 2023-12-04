package hashset;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		// HashSet do not store duplicate values
		// HashSet does not has order guaranteed
		HashSet<Integer> set = new HashSet<>();
		System.out.println(set.add(3));
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(set.add(2));
		System.out.println(set.add(1));
		System.out.println(set);
		System.out.println(set.contains(1));
		System.out.println(set.remove(1));
		System.out.println(set.remove(1));
		System.out.println(set.contains(1));
	}

}
