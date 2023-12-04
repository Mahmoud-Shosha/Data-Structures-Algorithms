package trie;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String str) {
		TrieNode currentNode = root;
		for (int level = 0; level < str.length(); level++) {
			int index = str.charAt(level) - 'a';
			if (currentNode.children[index] == null)
				currentNode.children[index] = new TrieNode();
			currentNode = currentNode.children[index];
		}
		currentNode.isEndOfWord = true;
	}

	public boolean search(String str) {
		TrieNode lastNode = internalSearch(str);
		if (lastNode == null) {
			return false;
		} else {
			return lastNode.isEndOfWord;
		}
	}

	private TrieNode internalSearch(String str) {
		TrieNode currentNode = root;
		for (int level = 0; level < str.length(); level++) {
			int index = str.charAt(level) - 'a';
			if (currentNode.children[index] == null)
				return null;
			currentNode = currentNode.children[index];
		}
		return currentNode;
	}

	public boolean delete(String str) {
		TrieNode lastNode = internalSearch(str);
		if (lastNode == null || !lastNode.isEndOfWord) {
			return false;
		} else {
			lastNode.isEndOfWord = false;
			return true;
		}
	}

}