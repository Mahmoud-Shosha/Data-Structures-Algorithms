package binaryexponentiation;

public class BinaryExponentiationProblem {

	// Time complexity is O(b), where b is the exponent
	public static int normalExpIterative(int base, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}

	// Time complexity is O(b), where b is the exponent
	public static int normalExpRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * normalExpRecursive(base, exponent - 1);
	}

	// Time complexity is O(log(b)), where b is the exponent
	public static int binaryExponentiationIterative(int base, int exponent) {
		int answer = 1;
		while (exponent > 0) {
			if (exponent % 2 == 1) {
				answer *= base; // if exponent is odd, then this bit is set
			}
			base *= base;
			exponent /= 2;
		}
		return answer;
	}

	// Time complexity is O(log(b)), where b is the exponent
	public static int binaryExponentiationRecursive(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		int result = binaryExponentiationRecursive(base, exponent / 2);
		if (exponent % 2 == 1) {
			return base * result * result; // if exponent is odd, then this bit is set
		} else {
			return result * result; // if exponent is even, then this bit is not set
		}
	}

}
