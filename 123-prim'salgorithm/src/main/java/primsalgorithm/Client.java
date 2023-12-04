package primsalgorithm;

import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		WeightedGraph graph = new WeightedGraph(new int[][] {{ 0, 2, 1, 0 },
															 { 2, 0, 3, 0 },
															 { 1, 3, 0, 1 },
															 { 0, 0, 1, 0 }});
		System.out.println(Arrays.deepToString(graph.getMstPrim()));

		graph = new WeightedGraph(new int[][] {{ 0, 7, 8, 0, 0, 0 },
											   { 7, 0, 3, 0, 6, 0 },
											   { 8, 3, 0, 3, 4, 0 },
											   { 0, 0, 3, 0, 2, 2 },
											   { 0, 6, 4, 2, 0, 2 },
											   { 0, 0, 0, 2, 2, 0 } });
		System.out.println(Arrays.deepToString(graph.getMstPrim()));
	}

}
