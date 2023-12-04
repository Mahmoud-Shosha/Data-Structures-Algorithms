package huffmancoding;

public class Node implements Comparable<Node> {

	int value;
	char character;
	Node left;
	Node right;

	@Override
	public int compareTo(Node node) {
		return this.value - node.value;
	}

}
