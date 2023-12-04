package dsu.simple;

public class Client {

	public static void main(String[] args) {
		// Let there be 5 persons with ids as 0, 1, 2, 3 and 4
		DSU dus = new DSU(5);
		System.out.println(dus.find(0) == dus.find(2));
		// 0 is a friend of 2
		dus.union(0, 2);
		System.out.println(dus.find(0) == dus.find(2));
		System.out.println(dus.find(4) == dus.find(2));
		// 4 is a friend of 2
		dus.union(4, 2);
		System.out.println(dus.find(4) == dus.find(2));
		System.out.println(dus.find(3) == dus.find(1));
		// 3 is a friend of 1
		dus.union(3, 1);
		System.out.println(dus.find(3) == dus.find(1));
		// Check if 4 is a friend of 0
		System.out.println(dus.find(4) == dus.find(0));
		// Check if 1 is a friend of 0
		System.out.println(dus.find(1) == dus.find(0));

	}

}
