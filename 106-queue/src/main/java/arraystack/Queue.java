package arraystack;

public class Queue<Value> {

	private static final int DEFAULT_CAPACITY = 10;
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private Object[] array;

	public Queue() {
		this(DEFAULT_CAPACITY);
	}

	public Queue(int capacity) {
		this.front = this.rear = -1;
		this.size = 0;
		this.capacity = capacity;
		this.array = new Object[capacity];
	}

	public int enqueue(Value value) {
		if (size == capacity) {
			System.out.println("Queue Overflow");
			return -1;
		} else {
			rear = (rear + 1) % capacity;
			array[rear] = value;
			size++;
			return size;
		}
	}

	@SuppressWarnings("unchecked")
	public Value dequeue() {
		if (size == 0) {
			System.out.println("Queue Underflow");
			return null;
		} else {
			front = (front + 1) % capacity;
			Value value = (Value) array[front];
			size--;
			return value;
		}
	}

	@Override
	public String toString() {
		if (size == 0)
			return "[]";
		StringBuilder result = new StringBuilder("[");
		for (int i = front + 1; i <= Math.max(rear, size - 1); i++) {
			result.append(array[i]);
			result.append(", ");
		}
		if (front >= rear) {
			for (int i = 0; i <= rear; i++) {
				result.append(array[i]);
				result.append(", ");
			}
		}
		if (result.length() >= 2)
			result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}

}