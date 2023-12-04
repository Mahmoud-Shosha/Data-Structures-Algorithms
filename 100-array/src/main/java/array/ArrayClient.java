package array;

public class ArrayClient {

	public static void main(String[] args) {
		System.out.println("Traverse An Array");
		Array.traverse();
		System.out.println("Insert In An Array");
		Array.printArray();
		Array.insert(2, "2");
		Array.printArray();
		Array.insert(0, "0");
		Array.printArray();
		Array.insert(4, "4");
		Array.printArray();
		System.out.println("Delete In An Array");
		Array.printArray();
		Array.delete(3);
		Array.printArray();
		Array.delete(0);
		Array.printArray();
		Array.delete(2);
		Array.printArray();
		System.out.println("Update In An Array");
		Array.printArray();
		Array.update(0, "Gamal");
		Array.printArray();
		Array.update(2, "Zombie");
		Array.printArray();
		Array.update(4, "Mahmoud");
		Array.printArray();
		System.out.println("Search In An Array");
		Array.printArray();
		System.out.println(Array.search("Gamal"));
		System.out.println(Array.search("Zombie"));
		System.out.println(Array.search("Mahmoud"));
		System.out.println(Array.search("mahmoud"));
	}

}
