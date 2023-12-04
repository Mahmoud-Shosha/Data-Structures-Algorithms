package weightedgraph;

import java.util.HashSet;

public class WeightedGraph<Value> {

	private HashSet<Vertex<Value>> adjacentList = new HashSet<>();

	public void addEdge(Vertex<Value> v1, Vertex<Value> v2, int weight) {
		Edge<Value> edge = new Edge<Value>(v1, v2, weight);
		v1.getEdges().add(edge);
		v2.getEdges().add(edge);
	}

	public void addVertex(Vertex<Value> v) {
		if (!adjacentList.contains(v)) {
			adjacentList.add(v);
		}
	}

	@Override
	public String toString() {
		// Get unduplicated edges
		HashSet<Edge<Value>> edges = new HashSet<>();
		for (Vertex<Value> vertex : adjacentList) {
			edges.addAll(vertex.getEdges());
		}
		// Construct the string
		if (edges.isEmpty()) {
			return "WeightedGraph    []";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("WeightedGraph    [\n");
		for (Edge<Value> edge : edges) {
			builder.append("                    ");
			builder.append(edge);
			builder.append("\n");
		}
		builder.append("                 ]");
		return builder.toString();
	}

}
