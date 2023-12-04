package adjacencymatrix;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		int graph[][] = new int[][] { { 0, 4, 5, 0, 0, 0 },
									  { 4, 0, 11, 9, 7, 0 },
									  { 5, 11, 0, 0, 3, 0 },
									  { 0, 9, 0, 0, 13, 2 },
									  { 0, 7, 3, 13, 0, 6 },
									  { 0, 0, 0, 2, 6, 0 } };
		DijkstraAlgorithm d = new DijkstraAlgorithm(graph);
		System.out.println(Arrays.toString(d.dijkstra(0)));
	}

}
