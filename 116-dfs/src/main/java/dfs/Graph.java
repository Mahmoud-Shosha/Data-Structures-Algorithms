package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph<Value> {

	private Map<Value, List<Value>> adjacentList = new HashMap<>();

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

	public List<Value> breadthFirst(Value vertex) {
		Queue<Value> queue = new LinkedList<>();
		Set<Value> visited = new HashSet<>();
		List<Value> result = new ArrayList<>();
		queue.add(vertex);
		visited.add(vertex);
		result.add(vertex);
		while (!queue.isEmpty()) {
			vertex = queue.remove();
			for (Value v : adjacentList.get(vertex)) {
				if (!visited.contains(v)) {
					queue.add(v);
					visited.add(v);
					result.add(v);
				}
			}
		}
		return result;
	}

	public List<Value> depthFirstRecursive(Value vertex) {
		Set<Value> visited = new HashSet<>();
		List<Value> result = new ArrayList<>();
		depthFirstRecursiveHelper(vertex, visited, result);
		return result;
	}

	private void depthFirstRecursiveHelper(Value vertex, Set<Value> visited, List<Value> result) {
		result.add(vertex);
		visited.add(vertex);
		for (Value v : adjacentList.get(vertex)) {
			if (!visited.contains(v)) {
				depthFirstRecursiveHelper(v, visited, result);
			}
		}
	}

	public List<Value> depthFirstIterative(Value vertex) {
		Stack<Value> stack = new Stack<>();
		Set<Value> visited = new HashSet<>();
		List<Value> result = new ArrayList<>();
		stack.push(vertex);
		visited.add(vertex);
		while (!stack.isEmpty()) {
			vertex = stack.pop();
			result.add(vertex);
			for (Value v : adjacentList.get(vertex)) {
				if (!visited.contains(v)) {
					stack.push(v);
					visited.add(v);
				}
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
