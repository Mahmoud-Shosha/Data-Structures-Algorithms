package dynamicprogramming;

public class Client {

	public static void main(String[] args) {
		// factorialsTo(10);
		// factorialsToUsingDP(10);
		System.out.println(fibonacciNumber(7));
		System.out.println(fibonacciNumberUsingDP(7));
		System.out.println(fibonacciNumberUsingDP2(6));
	}

	public static void factorialsTo(int n) {
		for (int i = 1; i <= n; i++) {
			int factorial = 1;
			for (int j = 1; j <= i; j++) {
				factorial = factorial * j;
			}
			System.out.println(i + "! is equal to " + factorial);
		}
	}

	public static void factorialsToUsingDP(int n) {
		// array to store the previously computed factorials
		int[] fact = new int[n + 1];
		// base case
		fact[1] = 1;
		for (int i = 2; i <= n; i++) {
			fact[i] = fact[i - 1] * i;
			System.out.println(i + "! is equal to " + fact[i]);

		}
	}

	public static int fibonacciNumber(int n) {
		// Base Cases
		if (n < 2) {
			return n;
		}
		// Recursive Call
		return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}

	// Memoization approach
	public static int fibonacciNumberUsingDP(int n) {
		int[] fib_term = new int[n + 1];
		return fibonacci(n, fib_term);
	}

	private static int fibonacci(int n, int[] fib_term) {
		if (n < 2) {
			return n;
		}
		// if the value of fib_term(n) has already been calculated, its value in the
		// array will not be 0, and if it isn't we can return fib_term(n)
		if (fib_term[n] != 0) {
			return fib_term[n];
		}
		// calculating fib_term(n)
		else {
			fib_term[n] = fibonacci(n - 1, fib_term) + fibonacci(n - 2, fib_term);
			return fib_term[n];
		}
	}

	// Tabular approach
	public static int fibonacciNumberUsingDP2(int n) {
		if (n < 2) {
			return n;
		}
		int[] fib_term = new int[n + 1];
		fib_term[0] = 0;
		fib_term[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib_term[i] = fib_term[i - 1] + fib_term[i - 2];
		}
		return fib_term[n];
	}

}
