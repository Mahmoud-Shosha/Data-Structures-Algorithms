package bellmanford;

import java.util.ArrayList;
import java.util.List;

public class BellmanFordAlgorithm {

	private final int graph[][];
	private final int size;
	private final static Integer INF = Integer.MAX_VALUE;

	public BellmanFordAlgorithm(int[][] graph) {
		this.graph = graph;
		this.size = graph.length;
	}

	public int[] bellmanFord(int source) {
		// Construct the edges array
		List<Integer[]> edges = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (graph[i][j] != 0) {
					edges.add(new Integer[] { i, j, graph[i][j] });
				}
			}
		}
		// Initialize the distance of the source node to 0 and the distances of all
		// other nodes in the graph to infinity
		int[] distance = new int[size];
		for (int i = 0; i < size; i++) {
			distance[i] = INF;
		}
		distance[source] = 0;
		// Relaxing edges
		int u, v, w;
		for (int i = 0; i < size - 1; i++) { // For V-1 times
			for (int j = 0; j < edges.size(); j++) { // For each edge u→v with weight w
				u = edges.get(j)[0];
				v = edges.get(j)[1];
				w = edges.get(j)[2];
				// Check if the distance to v can be improved by going through u
				if (distance[u] != INF && distance[u] + w < distance[v]) {
					distance[v] = distance[u] + w;
				}
			}
		}
		// Checking for negative cycles
		for (int j = 0; j < edges.size(); j++) { // For each edge u→v with weight w
			u = edges.get(j)[0];
			v = edges.get(j)[1];
			w = edges.get(j)[2];
			// If there is some edge which can be further relaxed then there is an negative
			// cycle in the graph
			if (distance[u] != INF && distance[u] + w < distance[v]) {
				return new int[0];
			}
		}
		return distance;

	}

}
