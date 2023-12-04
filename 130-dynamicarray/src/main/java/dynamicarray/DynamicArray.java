package dynamicarray;

public class DynamicArray<T> {

	private T[] array;
	private int size;

	@SuppressWarnings("unchecked")
	public DynamicArray(int initialSize) {
		array = (T[]) new Object[initialSize];
		this.size = 0;
	}

	@SuppressWarnings("unchecked")
	public T[] toArray() {
		T[] resultArray = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			resultArray[i] = array[i];
		}
		return resultArray;
	}

	public void insert(T element) {
		if (size == array.length) {
			resize();
		}
		array[size++] = element;
	}

	@SuppressWarnings("unchecked")
	private void resize() {
		T[] newArray = (T[]) new Object[2 * size];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		array = newArray;
	}

}
