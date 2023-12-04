package topologicalsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DirectedGraph<Value> {

	private Map<Value, List<Value>> adjacentList = new HashMap<>();

	public void addVertex(Value Vertex) {
		if (adjacentList.get(Vertex) == null) {
			adjacentList.put(Vertex, new ArrayList<>());
		}
	}

	public void addEdge(Value v1, Value v2) {
		adjacentList.get(v1).add(v2);
	}

	public void removeEdge(Value v1, Value v2) {
		adjacentList.get(v1).remove(v2);
	}

	public void removeVertex(Value vertex) {
		// Remove outgoing edges
		while (!adjacentList.get(vertex).isEmpty()) {
			removeEdge(vertex, adjacentList.get(vertex).get(0));
		}
		// Remove incoming edges
		for (Map.Entry<Value, List<Value>> u : adjacentList.entrySet()) {
			if (u.getValue().contains(vertex))
				u.getValue().remove(vertex);
		}
		// Remove the edge itself
		adjacentList.remove(vertex);
	}

	public List<Value> topologicalSort() {
		List<Value> sorted = new ArrayList<>();
		Map<Value, Integer> indegrees = new HashMap<>();
		Queue<Value> zeroIncoming = new LinkedList<Value>();
		// Construct the indegrees map to hold all vertices indegrees
		for (Map.Entry<Value, List<Value>> vertex : adjacentList.entrySet()) {
			for (Value u : vertex.getValue()) {
				if (indegrees.get(u) == null) {
					indegrees.put(u, 0);
				}
				indegrees.put(u, indegrees.get(u) + 1);
			}
		}
		// Add the vertices with 0 indegree to the zeroIncoming queue
		for (Value vertex : adjacentList.keySet()) {
			if (indegrees.get(vertex) == null) {
				zeroIncoming.add(vertex);
			}
		}
		// Construct the sorted list
		while (!zeroIncoming.isEmpty()) {
			Value vertex = zeroIncoming.poll();
			sorted.add(vertex);
			for (Value u : adjacentList.get(vertex)) {
				indegrees.put(u, indegrees.get(u) - 1);
				if (indegrees.get(u) == 0) {
					zeroIncoming.add(u);
				}
			}
		}
		// Check if we have a cycle
		if (sorted.size() != adjacentList.size())
			throw new RuntimeException("Graph contains at least one cycle!");
		else
			return sorted;
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
