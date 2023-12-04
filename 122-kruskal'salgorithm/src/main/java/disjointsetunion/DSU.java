package disjointsetunion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DSU<Item> {

	// Contains each items and a reference to its parent in the tree
	private Map<Item, Item> parent;
	// Contains the size of the tree rooted by an item
	private Map<Item, Integer> rank;

	public DSU(List<Item> items) {
		parent = new HashMap<>();
		rank = new HashMap<>();
		for (Item item : items) {
			parent.put(item, item);
			rank.put(item, 0);
		}
	}

	public DSU() {
		parent = new HashMap<>();
		rank = new HashMap<>();
	}

	public Item find(Item x) {
		if (parent.get(x) == x)
			return parent.get(x);
		Item tmp = find(parent.get(x));
		parent.put(x, tmp);
		return tmp;

	}

	public void union(Item x, Item y) {
		Item xRoot = find(x), yRoot = find(y);
		if (xRoot == yRoot)
			return;
		if (rank.get(xRoot) < rank.get(yRoot))
			parent.put(xRoot, yRoot);
		else if (rank.get(yRoot) < rank.get(xRoot))
			parent.put(yRoot, xRoot);
		else {
			parent.put(yRoot, xRoot);
			rank.put(xRoot, rank.get(xRoot) + 1);
		}
	}

}
