package arrayimplementation;

public class BinarySearchTreeClient {

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst = new BinarySearchTree<>();

		System.out.println(bst.DFSInOrder());
		System.out.println(bst.find(10));
		System.out.println("---------------------------\n");

		bst.insert(10);
		System.out.println(bst.DFSInOrder());
		System.out.println(bst.find(10));
		System.out.println(bst.find(22222));
		System.out.println("---------------------------\n");

		bst.insert(5);
		bst.insert(5);
		bst.insert(13);
		bst.insert(7);
		bst.insert(10);
		bst.insert(10);
		System.out.println(bst.DFSInOrder());
		System.out.println(bst.find(10));
		System.out.println(bst.find(7856));

	}

}