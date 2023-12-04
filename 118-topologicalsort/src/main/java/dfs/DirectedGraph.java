package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		Set<Value> visited = new HashSet<>();
		List<Value> result = new LinkedList<Value>();
		// Call the recursive helper function to store Topological Sort starting from
		// all vertices one by one
		for (Value vertex : adjacentList.keySet()) {
			if (!visited.contains(vertex)) {
				topologicalSortHelper(vertex, visited, new HashSet<>(), result);
			}
		}
		return result;
	}

	private void topologicalSortHelper(Value vertex, Set<Value> visited, Set<Value> beingVisited, List<Value> result) {
		visited.add(vertex);
		beingVisited.add(vertex);
		// Recur for all the vertices adjacent to this vertex
		for (Value u : adjacentList.get(vertex)) {
			if (!visited.contains(u)) {
				topologicalSortHelper(u, visited, beingVisited, result);
			} else if (beingVisited.contains(u)) {
				throw new RuntimeException("Graph contains at least one cycle!");
			}
		}
		result.add(0, vertex);
		beingVisited.remove(vertex);
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
