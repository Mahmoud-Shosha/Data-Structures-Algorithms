package heapimplementation;

public class Customer implements Comparable<Customer> {

	private int priority;
	private String name;

	public Customer(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Customer o) {
		return this.priority - o.priority;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", priority=" + priority + "]";
	}

}
