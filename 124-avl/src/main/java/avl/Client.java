package avl;

public class Client {

	public static void main(String[] args) {
		System.out.println("First tree");
		AVLTree<Integer> tree = new AVLTree<>();
		tree.insert(10);
		tree.insert(11);
		tree.insert(11);
		tree.insert(13);
		tree.insert(30);
		tree.insert(40);
		tree.insert(40);
		tree.preOrder();
		System.out.println("\n---------------------------");

		System.out.println("Second tree");
		tree = new AVLTree<>();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(220);
		tree.preOrder();
		System.out.println("\n---------------------------");

		System.out.println("Third tree");
		tree = new AVLTree<>();
		tree.insert(100);
		tree.insert(90);
		tree.insert(200);
		tree.insert(300);
		tree.insert(80);
		tree.insert(70);
		tree.insert(88);
		tree.insert(89);
		tree.insert(500);
		tree.insert(600);
		tree.insert(60);
		tree.preOrder();
		System.out.println("\n---------------------------");
	}

}
