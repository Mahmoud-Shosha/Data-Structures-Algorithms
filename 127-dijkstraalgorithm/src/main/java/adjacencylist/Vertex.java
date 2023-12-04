package adjacencylist;

import java.util.ArrayList;
import java.util.List;

public class Vertex<Value> {

	Value value;
	List<Edge<Value>> edges;

	public Vertex(Value value) {
		this.value = value;
		edges = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Vertex[" + value + "]";
	}

}
