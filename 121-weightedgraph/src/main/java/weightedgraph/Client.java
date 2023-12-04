package weightedgraph;

public class Client {

	public static void main(String[] args) {
		WeightedGraph<Integer> graph = new WeightedGraph<>();
		// vertices
		Vertex<Integer> v0 = new Vertex<>(0);
		Vertex<Integer> v1 = new Vertex<>(1);
		Vertex<Integer> v2 = new Vertex<>(2);
		Vertex<Integer> v3 = new Vertex<>(3);
		System.out.println(graph);
		graph.addVertex(v0);
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		System.out.println(graph);
		// edges
		graph.addEdge(v0, v1, 2);
		graph.addEdge(v1, v2, 3);
		graph.addEdge(v2, v0, 1);
		graph.addEdge(v2, v3, 1);
		graph.addEdge(v3, v2, 4);
		System.out.println(graph);

	}

}
