package kruskalsalgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex<Value> {

	private Value value;
	private List<Edge<Value>> edges;

	public Vertex(Value value) {
		this.value = value;
		edges = new ArrayList<>();
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public List<Edge<Value>> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge<Value>> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return "Vertex [value=" + value + ", edges=" + edges + "]";
	}

}
