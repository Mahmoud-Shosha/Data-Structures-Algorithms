package hashtablewithseparatechaining;

import java.util.Objects;

public class HashTable<K, V> {

	private static final int DEFAULT_CAPACITY = 16;
	private static final double DEFAULT_LOAD_FACTOR = 0.75;

	// bucketArray is used to store array of chains
	private HashNode<K, V>[] bucketArray;
	private int capacity;
	private int size;
	private double loadFactor;

	@SuppressWarnings("unchecked")
	public HashTable(int capacity, double loadFactor) {
		this.capacity = capacity;
		this.loadFactor = loadFactor;
		this.size = 0;
		this.bucketArray = (HashNode<K, V>[]) new HashNode[this.capacity];
	}

	public HashTable() {
		this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	private final int hashCode(K key) {
		return Objects.hashCode(key);
	}

	private int getBucketIndex(K key) {
		int hashCode = hashCode(key);
		int index = hashCode % capacity;
		index = index < 0 ? index * -1 : index; // hashCode(key) could be negative
		return index;
	}

	public void put(K key, V value) {
		// Find bucketIndex and hashCode for the key
		int bucketIndex = getBucketIndex(key);
		// Search the key
		HashNode<K, V> head = bucketArray[bucketIndex];
		HashNode<K, V> prev = null;
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			prev = head;
			head = head.next;
		}
		// If key not found create and add it
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		size++;
		if (prev == null) {
			bucketArray[bucketIndex] = newNode;
		} else {
			prev.next = newNode;
		}
		// Check load factor
		double currentLoadFactor = (1.0 * size) / capacity;
		if (currentLoadFactor > loadFactor) {
			System.out.println(currentLoadFactor + " is greater than " + loadFactor);
			System.out.println("Rehashing Started ...");
			rehash();
			System.out.println("New Size of Hash table: " + capacity);
		}
	}

	public V get(K key) {
		// Find bucketIndex and hashCode for the key
		int bucketIndex = getBucketIndex(key);
		// Search the key
		HashNode<K, V> head = bucketArray[bucketIndex];
		while (head != null) {
			if (head.key.equals(key))
				return head.value;
			head = head.next;
		}
		return null;
	}

	public V remove(K key) {
		// Find bucketIndex and hashCode for the key
		int bucketIndex = getBucketIndex(key);
		// Search the key
		HashNode<K, V> head = bucketArray[bucketIndex];
		HashNode<K, V> prev = null;
		while (head != null) {
			if (head.key.equals(key))
				break;
			prev = head;
			head = head.next;
		}
		// If key not found return, else remove it
		if (head == null) {
			return null;
		} else {
			if (prev != null) {
				prev.next = head.next;
			} else {
				bucketArray[bucketIndex] = head.next;
			}
			size--;
			return head.value;
		}
	}

	@SuppressWarnings("unchecked")
	private void rehash() {
		capacity *= 2;
		HashNode<K, V>[] temp = bucketArray;
		bucketArray = (HashNode<K, V>[]) new HashNode[capacity];
		size = 0;
		for (HashNode<K, V> headNode : temp) {
			while (headNode != null) {
				put(headNode.key, headNode.value);
				headNode = headNode.next;
			}
		}
	}

}