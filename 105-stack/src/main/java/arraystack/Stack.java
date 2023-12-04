package arraystack;

public class Stack<Value> {

	private static final int DEFAULT_CAPACITY = 10;
	private int capacity;
	private int top;
	private Object[] array;

	public Stack() {
		this(DEFAULT_CAPACITY);
	}

	public Stack(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		this.array = new Object[capacity];
	}

	public int push(Value value) {
		if (top + 1 == capacity) {
			System.out.println("Stack Overflow");
			return -1;
		} else {
			array[++top] = value;
		}
		return top;
	}

	@SuppressWarnings("unchecked")
	public Value pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
			return null;
		} else {
			return (Value) array[top--];
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		for (int i = 0; i <= top; i++) {
			result.append(array[i]);
			result.append(", ");
		}
		if (result.length() >= 2)
			result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}

}