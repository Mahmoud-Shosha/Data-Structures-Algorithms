package numberofwaysfromstartingpositiontoendingposition;

public class Client {

	public static void main(String[] args) {
		int numberOfWays = numberOfWaysFromStartingPositionToEndingPosition(3, 3);
		System.out.println("Number of ways to reach the last cell are: " + numberOfWays);
	}

	public static int numberOfWaysFromStartingPositionToEndingPosition(int N, int M) {
		// Declare the auxiliary minCost matrix
		int[][] waysCount = new int[N][M];
		// First cell, base case
		waysCount[0][0] = 1;
		// Bottom-up approach to build the waysCount matrix
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i == 0 && j == 0)
					continue;
				if (i - 1 >= 0)
					waysCount[i][j] += waysCount[i - 1][j];
				if (j - 1 >= 0)
					waysCount[i][j] += waysCount[i][j - 1];
			}
		}
		return waysCount[N - 1][M - 1];
	}

}
