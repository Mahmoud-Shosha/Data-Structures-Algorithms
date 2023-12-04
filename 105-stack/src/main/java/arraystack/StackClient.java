package arraystack;

public class StackClient {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(4);
		System.out.println("------------- push method -------------");
		System.out.println(stack);
		System.out.println(stack.push(25));
		System.out.println(stack);
		System.out.println(stack.push(13));
		System.out.println(stack.push(109));
		System.out.println(stack.push(-2225));
		System.out.println(stack);
		System.out.println(stack.push(99));
		System.out.println(stack);

		stack = new Stack<Integer>();
		System.out.println("------------- pop method -------------");
		System.out.println(stack.push(13));
		System.out.println(stack.push(109));
		System.out.println(stack.push(-2225));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.push(55598));
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}