package adjacencylist;

public class Pair<Value> implements Comparable<Pair<Value>> {

	Integer weight;
	Vertex<Value> vertex;

	public Pair(Vertex<Value> vertex, Integer weight) {
		this.weight = weight;
		this.vertex = vertex;
	}

	@Override
	public int compareTo(Pair<Value> o) {
		return this.weight - o.weight;
	}

}
