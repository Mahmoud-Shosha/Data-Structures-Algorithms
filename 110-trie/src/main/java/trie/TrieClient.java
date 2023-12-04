package trie;

public class TrieClient {

	public static void main(String[] args) {

		Trie trie = new Trie();

		System.out.println(trie.search("tea"));
		System.out.println(trie.search("ten"));
		System.out.println(trie.search("tearer"));
		System.out.println(trie.search("fear"));
		trie.insert("tea");
		trie.insert("ten");
		trie.insert("tearer");
		trie.insert("fear");
		System.out.println(trie.search("tea"));
		System.out.println(trie.search("ten"));
		System.out.println(trie.search("tearer"));
		System.out.println(trie.search("fear"));
		System.out.println(trie.search("te"));
		System.out.println("---------------------");
		System.out.println(trie.delete("tea"));
		System.out.println(trie.delete("tea"));
		System.out.println(trie.search("tea"));
		System.out.println(trie.search("ten"));
		System.out.println("---------------------");
		System.out.println(trie.delete("ggg"));
		System.out.println(trie.delete("ggg"));
		System.out.println(trie.search("ggg"));

	}

}