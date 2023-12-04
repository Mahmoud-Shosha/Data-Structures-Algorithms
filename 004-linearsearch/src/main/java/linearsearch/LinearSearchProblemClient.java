package linearsearch;

public class LinearSearchProblemClient {

	public static void main(String[] args) {

		System.out.printf("linearSearch(new Integer[] { 34, 51, 1, 2 }, 1) ==> %s\n",
				LinearSearchProblem.linearSearch(new Integer[] { 34, 51, 1, 2 }, 1));
		System.out.printf("linearSearch(new Integer[] { 34, 51, 1, 2 , 3, 45, 56, 687}, 56) ==> %s\n",
				LinearSearchProblem.linearSearch(new Integer[] { 34, 51, 1, 2, 3, 45, 56, 687 }, 56));
		System.out.printf("linearSearch(new Integer[] { 34, 51, 1, 2 , 3, 45, 56, 687}, 100) ==> %s\n",
				LinearSearchProblem.linearSearch(new Integer[] { 34, 51, 1, 2, 3, 45, 56, 687 }, 100));
		System.out.printf("linearSearch(new String[] {\"Hello\", \"hello\"}, \"hello\") ==> %s\n",
				LinearSearchProblem.linearSearch(new String[] { "Hello", "hello" }, "hello"));

	}

}
