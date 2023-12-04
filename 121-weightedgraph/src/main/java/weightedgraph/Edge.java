package weightedgraph;

public class Edge<Value> {

	private int weight;
	private Vertex<Value> source;
	private Vertex<Value> destination;

	public Edge(Vertex<Value> source, Vertex<Value> destination, int weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex<Value> getSource() {
		return source;
	}

	public void setSource(Vertex<Value> source) {
		this.source = source;
	}

	public Vertex<Value> getDestination() {
		return destination;
	}

	public void setDestination(Vertex<Value> destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source.getValue() + ", destination=" + destination.getValue() + ", weight=" + weight
				+ "]";
	}

}
