package tree;

public class BinaryTreeClient {
	public static void main(String[] args) {

		BinaryTree<Integer> bst = new BinaryTree<>();

		bst.insert(1);
		bst.insert(2);
		bst.insert(3);
		bst.insert(4);
		bst.insert(5);
		bst.insert(6);
		bst.insert(7);
		bst.insert(8);
		bst.insert(9);
		bst.insert(10);

		/*
		 *                           1
		 *                2                      3
		 *         4             5        6            7
		 *     8        9    10
		 * */
		System.out.println(bst.breadthFirtSearch());
		System.out.println(bst.DFSPreOrder());
		System.out.println(bst.DFSPostOrder());
		System.out.println(bst.DFSInOrder());
	}
}
