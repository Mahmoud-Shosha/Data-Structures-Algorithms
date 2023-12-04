package bridges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph<Value> {

	private Map<Value, List<Value>> adjacentList = new HashMap<>();
	private Integer time = 0;

	public void addVertex(Value Vertex) {
		if (adjacentList.get(Vertex) == null) {
			adjacentList.put(Vertex, new ArrayList<>());
		}
	}

	public void addEdge(Value v1, Value v2) {
		adjacentList.get(v1).add(v2);
		adjacentList.get(v2).add(v1);
	}

	public void removeEdge(Value v1, Value v2) {
		adjacentList.get(v1).remove(v2);
		adjacentList.get(v2).remove(v1);
	}

	public void removeVertex(Value vertex) {
		while (!adjacentList.get(vertex).isEmpty()) {
			removeEdge(vertex, adjacentList.get(vertex).get(0));
		}
		adjacentList.remove(vertex);
	}

	public List<List<Value>> getBridges() {
		Set<Value> visited = new HashSet<>();
		Map<Value, Value> parent = new HashMap<>();
		Map<Value, Integer> disc = new HashMap<>();
		Map<Value, Integer> low = new HashMap<>();
		time = 0;
		List<List<Value>> result = new ArrayList<>();
		for (Value vertex : adjacentList.keySet()) {
			if (!visited.contains(vertex))
				bridgesRecursiveHelper(vertex, visited, disc, low, parent, result);
		}
		return result;
	}

	private void bridgesRecursiveHelper(Value vertex, Set<Value> visited, Map<Value, Integer> disc,
			Map<Value, Integer> low, Map<Value, Value> parent, List<List<Value>> result) {
		// Mark the current node as visited
		visited.add(vertex);
		// Initialize discovery time and lowest link value
		disc.put(vertex, time);
		low.put(vertex, time);
		time++;
		// Go through all vertices adjacent to this vertex
		for (Value u : adjacentList.get(vertex)) {
			// Unvisited vertex
			if (!visited.contains(u)) {
				parent.put(u, vertex);
				bridgesRecursiveHelper(u, visited, disc, low, parent, result);
				low.put(vertex, Math.min(low.get(vertex), low.get(u)));
				// If the lowest vertex reachable from subtree under u is below u in DFS tree,
				// then u-v is a bridge
				if (low.get(u) > disc.get(vertex)) {
					List<Value> temp = new ArrayList<>();
					temp.add(vertex);
					temp.add(u);
					result.add(temp);
				}
			} else if (parent.get(vertex) == null || !parent.get(vertex).equals(u)) {
				low.put(vertex, Math.min(low.get(vertex), disc.get(u)));
			}
		}
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
