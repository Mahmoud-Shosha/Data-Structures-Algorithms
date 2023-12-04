package adjacencylist;

public class Client {

	public static void main(String[] args) {
		WeightedGraph<Integer> graph = new WeightedGraph<>();
		Vertex<Integer> v0 = new Vertex<>(0);
		Vertex<Integer> v1 = new Vertex<>(1);
		Vertex<Integer> v2 = new Vertex<>(2);
		Vertex<Integer> v3 = new Vertex<>(3);
		Vertex<Integer> v4 = new Vertex<>(4);
		Vertex<Integer> v5 = new Vertex<>(5);
		graph.addVertex(v0);
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addVertex(v4);
		graph.addVertex(v5);
		graph.addEdge(v0, v1, 4);
		graph.addEdge(v0, v2, 5);
		graph.addEdge(v1, v2, 11);
		graph.addEdge(v1, v3, 9);
		graph.addEdge(v1, v4, 7);
		graph.addEdge(v2, v4, 3);
		graph.addEdge(v3, v4, 13);
		graph.addEdge(v3, v5, 2);
		graph.addEdge(v4, v5, 6);
		System.out.println(graph.dijkstraAlgorithm(v0));

	}

}
