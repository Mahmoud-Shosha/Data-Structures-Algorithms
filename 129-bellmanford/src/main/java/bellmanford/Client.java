package bellmanford;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		
		int[][] graph = new int[][] { { 0, -5, 4, 0 },
									  { 0, 0, 0, 15 },
									  { 0, 6, 0, 0 },
									  { 0, 0, 2, 0 } };
		BellmanFordAlgorithm bf = new BellmanFordAlgorithm(graph);
		System.out.println(Arrays.toString(bf.bellmanFord(1)));
		
		// Valid output with negative cycles
		graph = new int[][] { { 0, -5, 4, 0 },
			  				  { 0, 0, 0, 15 },
			                  { 0, -18, 0, 0 },
			                  { 0, 0, 2, 0 } };
	    bf = new BellmanFordAlgorithm(graph);
		System.out.println(Arrays.toString(bf.bellmanFord(0)));
	}

}
