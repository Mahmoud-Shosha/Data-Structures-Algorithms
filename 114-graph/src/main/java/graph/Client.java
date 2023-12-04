package graph;

public class Client {

	public static void main(String[] args) {
		Graph<String> g = new Graph<>();
		g.addVertex("Tokyo");
		g.addVertex("Dallas");
		g.addVertex("Aspen");
		g.addVertex("Cairo");
		g.addVertex("Alex");
		g.addEdge("Dallas", "Tokyo");
		g.addEdge("Dallas", "Aspen");
		g.addEdge("Tokyo", "Aspen");
		g.addEdge("Cairo", "Alex");
		g.addEdge("Cairo", "Aspen");
		System.out.println(g);
		g.removeEdge("Cairo", "Alex");
		System.out.println(g);
		g.removeVertex("Dallas");
		System.out.println(g);
	}

}
