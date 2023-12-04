package adjacencylist;

public class Edge<Value> {

	int weight;
	Vertex<Value> source;
	Vertex<Value> destination;

	public Edge(Vertex<Value> source, Vertex<Value> destination, int weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

}
