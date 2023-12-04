package bridges;

public class Client {

	public static void main(String[] args) {
		System.out.println("Bridges in first graph ");
		Graph<Integer> g1 = new Graph<>();
		g1.addVertex(0);
		g1.addVertex(1);
		g1.addVertex(2);
		g1.addVertex(3);
		g1.addVertex(4);
		g1.addEdge(1, 0);
		g1.addEdge(0, 2);
		g1.addEdge(2, 1);
		g1.addEdge(0, 3);
		g1.addEdge(3, 4);
		System.out.println(g1.getBridges() + "\n"); // [[3, 4], [0, 3]]

		System.out.println("Bridges in Second graph");
		Graph<Integer> g2 = new Graph<>();
		g2.addVertex(0);
		g2.addVertex(1);
		g2.addVertex(2);
		g2.addVertex(3);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		g2.addEdge(2, 3);
		System.out.println(g2.getBridges() + "\n"); // [[2, 3], [1, 2], [0, 1]]

		System.out.println("Bridges in Third graph ");
		Graph<Integer> g3 = new Graph<>();
		g3.addVertex(0);
		g3.addVertex(1);
		g3.addVertex(2);
		g3.addVertex(3);
		g3.addVertex(4);
		g3.addVertex(5);
		g3.addVertex(6);
		g3.addEdge(0, 1);
		g3.addEdge(1, 2);
		g3.addEdge(2, 0);
		g3.addEdge(1, 3);
		g3.addEdge(1, 4);
		g3.addEdge(1, 6);
		g3.addEdge(3, 5);
		g3.addEdge(4, 5);
		System.out.println(g3.getBridges() + "\n"); // [[1, 6]]
	}

}
