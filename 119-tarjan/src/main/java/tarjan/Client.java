package tarjan;

public class Client {

	public static void main(String[] args) {

		DirectedGraph<Integer> g1 = new DirectedGraph<>();
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
		System.out.println("SCC in first graph ");
		System.out.println(g1.getSCC()); // [[4], [3], [1, 2, 0]]

		DirectedGraph<Integer> g2 = new DirectedGraph<>();
		g2.addVertex(0);
		g2.addVertex(1);
		g2.addVertex(2);
		g2.addVertex(3);
		g2.addEdge(0, 1);
		g2.addEdge(1, 2);
		g2.addEdge(2, 3);
		System.out.println("\nSCC in second graph ");
		System.out.println(g2.getSCC()); // [[3], [2], [1], [0]]

		DirectedGraph<Integer> g3 = new DirectedGraph<>();
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
		System.out.println("\nSCC in third graph ");
		System.out.println(g3.getSCC()); // [[5], [3], [4], [6], [2, 1, 0]]

		DirectedGraph<Integer> g4 = new DirectedGraph<>();
		g4.addVertex(0);
		g4.addVertex(1);
		g4.addVertex(2);
		g4.addVertex(3);
		g4.addVertex(4);
		g4.addVertex(5);
		g4.addVertex(6);
		g4.addVertex(7);
		g4.addVertex(8);
		g4.addVertex(9);
		g4.addEdge(0, 1);
		g4.addEdge(0, 3);
		g4.addEdge(1, 2);
		g4.addEdge(1, 4);
		g4.addEdge(2, 0);
		g4.addEdge(2, 6);
		g4.addEdge(3, 2);
		g4.addEdge(4, 5);
		g4.addEdge(4, 6);
		g4.addEdge(5, 6);
		g4.addEdge(5, 7);
		g4.addEdge(5, 8);
		g4.addEdge(5, 9);
		g4.addEdge(6, 4);
		g4.addEdge(7, 9);
		g4.addEdge(8, 9);
		g4.addEdge(9, 8);
		System.out.println("\nSCC in fourth graph ");
		System.out.println(g4.getSCC()); // [[8, 9], [7], [5, 4, 6], [3, 2, 1, 0]]

		DirectedGraph<Integer> g5 = new DirectedGraph<>();
		g5.addVertex(0);
		g5.addVertex(1);
		g5.addVertex(2);
		g5.addVertex(3);
		g5.addVertex(4);
		g5.addEdge(0, 1);
		g5.addEdge(1, 2);
		g5.addEdge(2, 3);
		g5.addEdge(2, 4);
		g5.addEdge(3, 0);
		g5.addEdge(4, 2);
		System.out.println("\nSCC in fifth graph ");
		System.out.println(g5.getSCC()); // [[4, 3, 2, 1, 0]]
	}

}
