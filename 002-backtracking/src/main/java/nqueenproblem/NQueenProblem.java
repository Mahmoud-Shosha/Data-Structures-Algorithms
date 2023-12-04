package nqueenproblem;

public class NQueenProblem {
	
	/*
	 * 0,0    0,1    0,2    0,3

	 * 1,0    1,1    1,2    1,3
		
     * 2,0    2,1    2,2    2,3
		
	 * 3,0    3,1    3,2    3,3
	 */

	/*
	 * The size of the board is N * N	
	 */
	private static int N;

	/*
	 * The difference between the row number and the column number is constant and
	 * unique for each left diagonal. ld (left diagonal) is an array where its
	 * indices indicate row-col+N-1 (N-1) is for shifting the difference to avoid
	 * storing negative indices (from most left right diagonal 0, 1, 2, 3, ... 2*N
	 * -1). ld is used to check whether a queen can be placed on left diagonal or
	 * not
	 */
	private static int[] ld;

	/*
	 * The sum of the row number and the column number is constant and unique for
	 * each right diagonal. rd (right diagonal) is an array where its indices
	 * indicate row+col (from most left right diagonal 0, 1, 2, 3, ... 2*N -1). rd
	 * is used to check whether a queen can be placed on right diagonal or not
	 */
	private static int[] rd;

	/*
	 * Is used to check whether a queen can be placed in that row or not
	 */
	private static int[] rows;

	/*
	 * Represent the board with N*N 2D array, 1 means Queen and 0 means anything
	 * other
	 */
	private static int[][] board;

	/*
	 * This function solves the N Queen problem using Backtracking. It returns false
	 * if queens cannot be placed, otherwise, return true and prints placement of
	 * queens in the form of 1s. There may be more than one solutions, this function
	 * prints one of the feasible solutions.
	 */
	public static boolean solve(int boardSize) {
		N = boardSize;
		ld = new int[2 * N - 1];
		rd = new int[2 * N - 1];
		rows = new int[N];
		board = new int[N][N];
		System.out.println("N Queen Problem with " + N + " * " + N + " board");
		if (recursiveSolve(0)) {
			printSolution();
			return true;
		} else {
			System.out.println("Solution does not exist\n");
			return false;
		}
	}

	/* A function to print the solution */
	private static void printSolution() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("  " + board[i][j] + "  ");
			}
			System.out.println("\n");
		}
	}

	/*
	 * A recursive function to solve N Queen problem
	 */
	private static boolean recursiveSolve(int col) {
		// base case: If all queens are placed then return true
		if (col >= N)
			return true;
		// Consider this column and try placing this queen in all rows one by one
		for (int i = 0; i < N; i++) {
			// Check if a queen can be placed on board[i][col]
			if (ld[i - col + N - 1] != 1 && rd[i + col] != 1 && rows[i] != 1) {
				// Place this queen in board[i][col]
				board[i][col] = 1;
				ld[i - col + N - 1] = rd[i + col] = rows[i] = 1;
				// Recur to place rest of the queens
				if (recursiveSolve(col + 1)) {
					return true;
				}
				// BACKTRACK: If placing queen in board[i][col] doesn't lead to a solution, then
				// remove queen from board[i][col]
				board[i][col] = 0;
				ld[i - col + N - 1] = rd[i + col] = rows[i] = 0;
			}
		}
		// If the queen cannot be placed in any row in this column col then return false
		return false;
	}

}
