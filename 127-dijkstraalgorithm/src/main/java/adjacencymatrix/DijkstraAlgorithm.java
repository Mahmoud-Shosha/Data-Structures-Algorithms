package adjacencymatrix;

public class DijkstraAlgorithm {

	private final int graph[][];
	private final int size;
	private Boolean visited[];
	private int distance[];

	public DijkstraAlgorithm(int[][] graph) {
		this.graph = graph;
		this.size = graph.length;
		this.visited = new Boolean[size];
		this.distance = new int[size];
	}

	public int[] dijkstra(int source) {
		// Initialize all distances as INFINITY and visited as false
		for (int i = 0; i < size; i++) {
			distance[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}
		// Distance of source vertex from itself is always 0
		distance[source] = 0;
		// Find shortest path for all vertices
		for (int i = 0; i < size - 1; i++) {
			// Pick the minimum distance vertex from unvisited vertices
			int v = minDistance();
			// Mark the picked vertex as visited
			visited[v] = true;
			// Updating distance of the adjacent vertices of the picked vertex
			for (int u = 0; u < size; u++) {
				if (!visited[u] && graph[v][u] != 0 && distance[v] + graph[v][u] < distance[u]) {
					distance[u] = distance[v] + graph[v][u];
				}
			}
		}
		return distance;
	}

	private int minDistance() {
		int minValue = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < size; i++) {
			if (visited[i] == false && distance[i] <= minValue) {
				minValue = distance[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
