package factorial;

public class FactorialProblem {

	public static int iterativeFactorial(int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int recursiveFactorial(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * recursiveFactorial(num - 1);
		}
	}

}
