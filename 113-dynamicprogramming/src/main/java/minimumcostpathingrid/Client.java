package minimumcostpathingrid;

public class Client {

	public static void main(String[] args) {
		int[][] cost = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 }, { 2, 9, 8, 2 } };
		int minCost = minimumCostPathInGrid(cost, 4, 4);
		System.out.println("Cost of minimum cost path from (0,0) to (N-1,M-1) is: " + minCost);
	}

	public static int minimumCostPathInGrid(int[][] cost, int N, int M) {
		// Declare the auxiliary minCost matrix
		int[][] minCost = new int[N][M];
		// First cell, base case
		minCost[0][0] = cost[0][0];
		// Bottom-up approach to build the minCost matrix
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i == 0 && j == 0)
					continue;
				// Variable to store the minimum cost path till now
				int currCost = Integer.MAX_VALUE;
				if (i - 1 >= 0)
					currCost = min(currCost, minCost[i - 1][j]);
				if (j - 1 >= 0)
					currCost = min(currCost, minCost[i][j - 1]);
				// Extend the current cell to make a mincost path till (i,j)
				minCost[i][j] = currCost + cost[i][j];
			}
		}
		return minCost[N - 1][M - 1];
	}

	private static int min(int a, int b) {
		return a <= b ? a : b;
	}

}
