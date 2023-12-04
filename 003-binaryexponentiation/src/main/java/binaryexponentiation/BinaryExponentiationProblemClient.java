package binaryexponentiation;

public class BinaryExponentiationProblemClient {

	public static void main(String[] args) {

		System.out.println("-- Normal Iteravive --");
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpIterative(2, 0));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpIterative(2, 1));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpIterative(2, 2));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpIterative(2, 3));
		System.out.println("-- Normal Recursive --");
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpRecursive(2, 0));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpRecursive(2, 1));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpRecursive(2, 2));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.normalExpRecursive(2, 3));
		System.out.println("-- Binary Exponentiation Recursive --");
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationRecursive(2, 0));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationRecursive(2, 1));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationRecursive(2, 2));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationRecursive(2, 3));
		System.out.println("-- Binary Exponentiation Iterative --");
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationIterative(2, 0));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationIterative(2, 1));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationIterative(2, 2));
		System.out.println("2^2 -> " + BinaryExponentiationProblem.binaryExponentiationIterative(2, 3));

	}

}
