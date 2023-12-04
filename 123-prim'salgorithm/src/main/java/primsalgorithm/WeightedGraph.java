package primsalgorithm;

import java.util.Arrays;

public class WeightedGraph {

	private int[][] adjacentMatrix;

	public WeightedGraph(int[][] adjacentMatrix) {
		this.adjacentMatrix = adjacentMatrix;
	}

	// Select the vertex which has the least weight edge of all unselected vertices
	private static int selectMinVertex(int[] value, boolean[] setMST) {
		int minimum = Integer.MAX_VALUE;
		int vertex = 0;
		for (int i = 0; i < value.length; i++) {
			if (setMST[i] == false && value[i] < minimum) {
				vertex = i;
				minimum = value[i];
			}
		}
		return vertex;
	}

	public int[][] getMstPrim() {
		int v = adjacentMatrix.length;
		// It contains the vertex (parent[index]) that leads to a vertex (index)
		int[] parent = new int[v];
		// It contains cost (value[index]) to vertices (index) outside MST vertices
		int[] value = new int[v];
		// It marks nodes in MST
		boolean[] setMST = new boolean[v];

		// Set max cost to all vertices outside MST
		for (int i = 0; i < v; i++) {
			value[i] = Integer.MAX_VALUE;
		}

		// Start by vertex 0
		// Set vertex 0 cost to 0 to be selected in the first iteration
		value[0] = 0;
		// parent[0] = -1; // No vertex leads to it as it is the first one

		// Iterate through all the vertices of the graph
		for (int i = 0; i < v - 1; i++) {
			// Select min edge vertex from all vertices connecting the currently chosen
			// vertices
			int U = selectMinVertex(value, setMST);
			setMST[U] = true;

			// For the newly added vertex
			// 1- Add the cost to all the vertices it connects to,
			// 2- Add it as the parent of all the vertices it connects to
			// adjacentMatrix[U][j] != 0 -> Means there an edge to this vertex
			// setMST[j] == false -> Means this vertex is not in the MST
			// adjacentMatrix[U][j] < value[j] -> Means this edge must provide a min cost
			// than another existing edge
			for (int j = 0; j < v; j++) {
				if (adjacentMatrix[U][j] != 0 && setMST[j] == false && adjacentMatrix[U][j] < value[j]) {
					value[j] = adjacentMatrix[U][j];
					parent[j] = U;
				}
			}
		}

		// Construct MST
		int[][] result = new int[v][v];
		for (int i = 1; i < v; i++) {
			result[i][parent[i]] = adjacentMatrix[i][parent[i]];
		}
		return result;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(adjacentMatrix);
	}

}
