package subsetsumproblem;

import java.util.Arrays;
import java.util.Stack;

public class SubsetSumProblem {

	private static int[] set;
	private static int required_sum;
	private static Stack<Integer> solutionSet;
	public static boolean hasSolution;

	public static void solve(int[] set, int required_sum) {
		SubsetSumProblem.set = set;
		SubsetSumProblem.required_sum = required_sum;
		solutionSet = new Stack<>();
		hasSolution = false;
		System.out.println("Set: " + Arrays.toString(set));
		System.out.println("Required Sum: " + required_sum);
		System.out.println("Subsets: ");
		recursiveSolve(0, 0);
		if (!hasSolution) {
			System.out.println("No Solution");
		}
		System.out.println();
	}

	private static void recursiveSolve(int sum, int index) {
		if (sum > required_sum) {
			return;
		} else if (sum == required_sum) {
			hasSolution = true;
			printSolution();
			return;
		} else {
			for (int i = index; i < set.length; i++) {
				solutionSet.push(set[i]);
				recursiveSolve(sum + set[i], i + 1);
				solutionSet.pop();
			}
		}
	}

	private static void printSolution() {
		for (Integer item : solutionSet) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
