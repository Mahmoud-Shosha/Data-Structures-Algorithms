package kruskalsalgorithm;

public class Client {

	public static void main(String[] args) {
		WeightedGraph<Integer> graph = new WeightedGraph<>();
		Vertex<Integer> v0 = new Vertex<>(0);
		Vertex<Integer> v1 = new Vertex<>(1);
		Vertex<Integer> v2 = new Vertex<>(2);
		Vertex<Integer> v3 = new Vertex<>(3);
		graph.addVertex(v0);
		graph.addVertex(v1);
		graph.addVertex(v2);
		graph.addVertex(v3);
		graph.addEdge(v0, v1, 2);
		graph.addEdge(v1, v2, 3);
		graph.addEdge(v2, v0, 1);
		graph.addEdge(v2, v3, 1);
		graph.addEdge(v3, v2, 4);
		System.out.println("============================ First Graph ============================");
		System.out.println(graph);
		System.out.println(graph.getMstKruskal());

		WeightedGraph<String> graph2 = new WeightedGraph<>();
		Vertex<String> n0 = new Vertex<>("0");
		Vertex<String> n1 = new Vertex<>("1");
		Vertex<String> n2 = new Vertex<>("2");
		Vertex<String> n3 = new Vertex<>("3");
		Vertex<String> n4 = new Vertex<>("4");
		Vertex<String> n5 = new Vertex<>("5");
		graph2.addVertex(n0);
		graph2.addVertex(n1);
		graph2.addVertex(n2);
		graph2.addVertex(n3);
		graph2.addVertex(n4);
		graph2.addVertex(n5);
		graph2.addEdge(n0, n1, 7);
		graph2.addEdge(n0, n2, 8);
		graph2.addEdge(n1, n2, 3);
		graph2.addEdge(n1, n4, 6);
		graph2.addEdge(n2, n3, 3);
		graph2.addEdge(n2, n4, 4);
		graph2.addEdge(n3, n4, 2);
		graph2.addEdge(n3, n5, 2);
		graph2.addEdge(n4, n5, 2);

		System.out.println("============================ Second Graph ============================");
		System.out.println(graph2);
		System.out.println(graph2.getMstKruskal());

	}

}
