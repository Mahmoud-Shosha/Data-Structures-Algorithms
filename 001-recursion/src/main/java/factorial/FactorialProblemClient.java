package factorial;

public class FactorialProblemClient {

	public static void main(String[] args) {

		System.out.println(FactorialProblem.iterativeFactorial(-5));
		System.out.println(FactorialProblem.recursiveFactorial(-5));
		System.out.println(FactorialProblem.iterativeFactorial(0));
		System.out.println(FactorialProblem.recursiveFactorial(0));
		System.out.println(FactorialProblem.iterativeFactorial(1));
		System.out.println(FactorialProblem.recursiveFactorial(1));
		System.out.println(FactorialProblem.iterativeFactorial(2));
		System.out.println(FactorialProblem.recursiveFactorial(2));
		System.out.println(FactorialProblem.iterativeFactorial(3));
		System.out.println(FactorialProblem.recursiveFactorial(3));

	}

}
