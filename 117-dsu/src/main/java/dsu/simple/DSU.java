package dsu.simple;

public class DSU {

	private int[] rank, parent;

	public DSU(int n) {
		rank = new int[n];
		parent = new int[n];
		// Creates n sets with single item in each
		// Initially, all elements are in their own set
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	// Returns representative of x's set
	int find(int x) {
		if (parent[x] == x) // then x is the representative of his set
			return parent[x];
		return parent[x] = find(parent[x]);
	}

	// Unites the set that includes x and the set that includes x
	void union(int x, int y) {
		int xRoot = find(x), yRoot = find(y);
		if (xRoot == yRoot) // x and y elements are in the same set
			return;
		if (rank[xRoot] < rank[yRoot]) // Then move x under y
			parent[xRoot] = yRoot;
		else if (rank[yRoot] < rank[xRoot]) // Then move y under x
			parent[yRoot] = xRoot;
		else {
			parent[yRoot] = xRoot; // Move y under x (doesn't matter which one goes where)
			rank[xRoot] = rank[xRoot] + 1;
		}
	}

}
