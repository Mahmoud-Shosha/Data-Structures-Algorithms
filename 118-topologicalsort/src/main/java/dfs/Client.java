package dfs;

public class Client {

	public static void main(String[] args) {
		DirectedGraph<Integer> g2 = new DirectedGraph<>();
		g2.addVertex(0);
		g2.addVertex(1);
		g2.addVertex(2);
		g2.addVertex(3);
		g2.addVertex(4);
		g2.addVertex(5);
		g2.addEdge(5, 2);
		g2.addEdge(5, 0);
		g2.addEdge(4, 0);
		g2.addEdge(4, 1);
		g2.addEdge(2, 3);
		g2.addEdge(3, 1);
		System.out.println(g2.topologicalSort()); // [5, 4, 2, 3, 1, 0]

		DirectedGraph<String> g = new DirectedGraph<>();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("B", "E");
		g.addEdge("C", "F");
		g.addEdge("C", "D");
		g.addEdge("E", "F");
		System.out.println(g.topologicalSort()); // [A, C, B, E, F, D]

		g = new DirectedGraph<>();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("B", "E");
		g.addEdge("C", "F");
		g.addEdge("C", "D");
		g.addEdge("E", "F");
		g.addEdge("B", "F"); // Adding this edge will not make a cycle
		System.out.println(g.topologicalSort()); // [A, C, B, E, F, D]

		g = new DirectedGraph<>();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("B", "E");
		g.addEdge("C", "F");
		g.addEdge("C", "D");
		g.addEdge("E", "F");
		g.addEdge("F", "B"); // Adding this edge will make a cycle
		System.out.println(g.topologicalSort()); // [A, B, C, E, D, F]
	}

}
