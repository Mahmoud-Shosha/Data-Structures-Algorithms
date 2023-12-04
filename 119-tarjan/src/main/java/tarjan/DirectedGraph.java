package tarjan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class DirectedGraph<Value> {

	private Map<Value, List<Value>> adjacentList = new HashMap<>();
	private Integer time = 0;

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

	public List<List<Value>> getSCC() {
		Map<Value, Integer> disc = new HashMap<>();
		Map<Value, Integer> low = new HashMap<>();
		Set<Value> stackMember = new HashSet<>();
		Stack<Value> stack = new Stack<>();
		time = 0;
		List<List<Value>> result = new ArrayList<>();
		for (Value vertex : adjacentList.keySet()) {
			if (disc.get(vertex) == null)
				SCCRecursiveHelperl(vertex, disc, low, stackMember, stack, result);
		}
		return result;
	}

	private void SCCRecursiveHelperl(Value vertex, Map<Value, Integer> disc, Map<Value, Integer> low,
			Set<Value> stackMember, Stack<Value> stack, List<List<Value>> result) {
		// Initialize discovery time and lowest link value
		disc.put(vertex, time);
		low.put(vertex, time);
		time++;
		// Add the vertex to the search tree / stack
		stackMember.add(vertex);
		stack.push(vertex);
		// Go through all vertices adjacent to this vertex
		for (Value u : adjacentList.get(vertex)) {
			// Unvisited vertex
			if (disc.get(u) == null) {
				SCCRecursiveHelperl(u, disc, low, stackMember, stack, result);
				low.put(vertex, Math.min(low.get(vertex), low.get(u)));
				// Visited vertex and in current search tree / stack
			} else if (stackMember.contains(u)) {
				low.put(vertex, Math.min(low.get(vertex), disc.get(u)));
			}
		}
		// If vertex has the same value in low and disc, then it is the head of the SCC
		Value w = null;
		if (low.get(vertex).equals(disc.get(vertex))) {
			List<Value> temp = new ArrayList<>();
			result.add(temp);
			while (w != vertex) {
				w = stack.pop();
				stackMember.remove(w);
				temp.add(w);
			}
		}
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
