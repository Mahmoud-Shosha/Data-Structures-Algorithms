package numberofwaysfromstartingpositiontoendingpositionwithblocks;

public class Client {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int numberOfWays = numberOfWaysFromStartingPositionToEndingPositionWithBlocks(matrix, 3, 3);
		System.out.println("Number of ways to reach the last cell are: " + numberOfWays);
		int[][] matrix2 = { { 0, 0, -1 }, { 0, 0, 0 }, { -1, 0, 0 } };
		numberOfWays = numberOfWaysFromStartingPositionToEndingPositionWithBlocks(matrix2, 3, 3);
		System.out.println("Number of ways to reach the last cell are: " + numberOfWays);
		int[][] matrix3 = { { 0, 0, -1 }, { 0, 0, 0 }, { -1, 0, -1 } };
		numberOfWays = numberOfWaysFromStartingPositionToEndingPositionWithBlocks(matrix3, 3, 3);
		System.out.println("Number of ways to reach the last cell are: " + numberOfWays);
		int[][] matrix4 = { { -1, 0, -1 }, { 0, 0, 0 }, { -1, 0, 0 } };
		numberOfWays = numberOfWaysFromStartingPositionToEndingPositionWithBlocks(matrix4, 3, 3);
		System.out.println("Number of ways to reach the last cell are: " + numberOfWays);
	}

	public static int numberOfWaysFromStartingPositionToEndingPositionWithBlocks(int[][] matrix, int N, int M) {
		// Check the edge cases 1 and 2
		if (matrix[0][0] == -1 || matrix[N - 1][M - 1] == -1) {
			return 0;
		}
		// Declare the auxiliary minCost matrix
		int[][] waysCount = new int[N][M];
		// First cell, base case
		waysCount[0][0] = 1;
		// Bottom-up approach to build the waysCount matrix
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i == 0 && j == 0)
					continue;
				// skip the barrier
				if (matrix[i][j] == -1)
					continue;
				if (i - 1 >= 0 && matrix[i - 1][j] != -1)
					waysCount[i][j] += waysCount[i - 1][j];
				if (j - 1 >= 0 && matrix[i][j - 1] != -1)
					waysCount[i][j] += waysCount[i][j - 1];
			}
		}
		return waysCount[N - 1][M - 1];
	}

}
