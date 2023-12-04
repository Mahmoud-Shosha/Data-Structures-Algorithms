package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public String toString() {
		return adjacentList.toString();
	}

}
