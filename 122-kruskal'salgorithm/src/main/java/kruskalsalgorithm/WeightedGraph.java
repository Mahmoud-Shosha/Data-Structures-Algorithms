package kruskalsalgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import disjointsetunion.DSU;

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

	public WeightedGraph<Value> getMstKruskal() {
		// Get needed data structures
		int e = 0, i = 0;
		WeightedGraph<Value> result = new WeightedGraph<>();
		DSU<Vertex<Value>> dsu = new DSU<>(new ArrayList<Vertex<Value>>(adjacentList));
		// Get the edges list
		List<Edge<Value>> edges = new ArrayList<>();
		for (Vertex<Value> edge : adjacentList) {
			edges.addAll(edge.getEdges());
		}
		// Sort the edges list
		Collections.sort(edges, new Comparator<Edge<Value>>() {
			public int compare(Edge<Value> e1, Edge<Value> e2) {
				return e1.getWeight() - e2.getWeight();
			}
		});
		// Iterate till we include V-1 edges in MST
		while (e < adjacentList.size() - 1) {
			// Checking if adding this edge forms a cycle or not
			Edge<Value> edge = edges.get(i++);
			Vertex<Value> u = dsu.find(edge.getSource());
			Vertex<Value> v = dsu.find(edge.getDestination());
			if (u != v) {
				// Including the edge
				dsu.union(u, v);
				u = new Vertex<>(edge.getSource().getValue());
				v = new Vertex<>(edge.getDestination().getValue());
				result.addVertex(u);
				result.addVertex(v);
				result.addEdge(u, v, edge.getWeight());
				// Increasing the edge count
				e++;
			}
		}
		return result;
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
