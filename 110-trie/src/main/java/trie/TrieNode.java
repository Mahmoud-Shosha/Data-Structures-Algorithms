package trie;

public class TrieNode {

	static final int ALPHABET_SIZE = 26;
	TrieNode[] children;
	boolean isEndOfWord;

	public TrieNode() {
		children = new TrieNode[ALPHABET_SIZE];
		isEndOfWord = false;
	}

}
