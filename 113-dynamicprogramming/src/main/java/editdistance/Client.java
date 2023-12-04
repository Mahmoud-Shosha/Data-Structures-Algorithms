package editdistance;

public class Client {

	public static void main(String[] args) {
		String str1 = "sunday";
		String str2 = "saturday";
		System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
		System.out.println(editDistanceWithDP(str1, str2, str1.length(), str2.length()));
	}

	public static int editDistance(String str1, String str2, int N, int M) {
		// base case: if first string is empty then insert all chareacters into first
		if (N == 0)
			return M;
		// base case: if second string is empty then delete all remaining characters of
		// first
		if (M == 0)
			return N;
		// If last characters are same, simply ignore
		if (str1.charAt(N - 1) == str2.charAt(M - 1))
			return editDistance(str1, str2, N - 1, M - 1);
		// Recur for all cases
		return 1 + min(editDistance(str1, str2, N, M - 1), editDistance(str1, str2, N - 1, M),
				editDistance(str1, str2, N - 1, M - 1));
	}

	public static int editDistanceWithDP(String str1, String str2, int N, int M) {
		// Define a dp table
		int[][] dp = new int[N + 1][M + 1];
		// fill the dp table in bottom-up manner
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= M; j++) {
				// If first string is empty, insert remaining chars
				if (i == 0)
					dp[i][j] = j;
				// If second string is empty, delete remaining chars
				else if (j == 0)
					dp[i][j] = i;
				// If last characters are same
				// Recur for the remaining string
				else if (str1.charAt(i - 1) == str2.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				// Otherwise, there are three options
				else
					dp[i][j] = 1 + min(dp[i][j - 1], // Insert
							dp[i - 1][j], // Remove
							dp[i - 1][j - 1] // replace
					);
			}
		}
		// Return the answer
		return dp[N][M];
	}

	private static int min(int x, int y, int z) {
		return min(min(x, y), z);
	}

	private static int min(int x, int y) {
		return x <= y ? x : y;
	}
}
