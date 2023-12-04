package adjacencylist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class WeightedGraph<Value> {

	private HashSet<Vertex<Value>> adjacentList = new HashSet<>();

	public void addEdge(Vertex<Value> v1, Vertex<Value> v2, int weight) {
		v1.edges.add(new Edge<Value>(v1, v2, weight));
		v2.edges.add(new Edge<Value>(v2, v1, weight));
	}

	public void addVertex(Vertex<Value> v) {
		if (!adjacentList.contains(v)) {
			adjacentList.add(v);
		}
	}

	public Map<Vertex<Value>, Integer> dijkstraAlgorithm(Vertex<Value> source) {
		// Initialize all distances as INFINITY and visited as false
		PriorityQueue<Pair<Value>> pq = new PriorityQueue<>(adjacentList.size());
		Set<Vertex<Value>> visited = new HashSet<>();
		Map<Vertex<Value>, Integer> distance = new HashMap<>();
		// Distance of source vertex from itself is always 0
		distance.put(source, 0);
		pq.add(new Pair<>(source, 0));
		// Find shortest path for all vertices
		while (!pq.isEmpty()) {
			// Pick the minimum distance vertex from unvisited vertices
			Vertex<Value> currentVertex = pq.poll().vertex; 
			visited.add(currentVertex);
			for (Edge<Value> edge : currentVertex.edges) {
				if (!visited.contains(edge.destination)) {
					pq.add(new Pair<>(edge.destination, edge.weight));
					// Updating distance of the adjacent vertices of the picked vertex
					int newDistance = distance.get(currentVertex) + edge.weight;
					if (distance.get(edge.destination) == null || newDistance < distance.get(edge.destination)) {
						distance.put(edge.destination, newDistance);
					}
				}
			}
		}
		return distance;
	}

}
