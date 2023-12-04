package floydwarshall;

public class FloydWarshallAlgorithm {

	private final int graph[][];
	private final int size;
	private final static Integer INF = Integer.MAX_VALUE;

	public FloydWarshallAlgorithm(int[][] graph) {
		this.graph = graph;
		this.size = graph.length;
	}

	public int[][] floydWarshall() {
		int[][] distance = new int[size][size];
		// Init the distance matrix
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					distance[i][j] = 0;
				} else if (graph[i][j] == 0) {
					distance[i][j] = Integer.MAX_VALUE;
				} else {
					distance[i][j] = graph[i][j];
				}
			}
		}
		// Run Floyd Warshall algorithm
		for (int k = 0; k < size; k++) {
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (distance[i][k] < INF && distance[k][j] < INF) {
						distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
					}
				}
			}
		}
		return distance;

	}

}
