package huffmancoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class HuffmanCoding {

	public static String encode(String text) {
		Node root = buildHuffmanTree(text);
		Map<Character, String> codesMap = getCodesMap(root);
		System.out.println("MAPPING: " + codesMap);
		return getEncodedText(text, codesMap);
	}

	// Construct the Huffman coding tree
	private static Node buildHuffmanTree(String text) {
		// Construct the frequencies map
		Map<Character, Integer> frequencies = new HashMap<>();
		for (Character c : text.toCharArray()) {
			Integer count = frequencies.get(c);
			if (count == null) {
				frequencies.put(c, 1);
			} else {
				frequencies.put(c, count + 1);
			}
		}
		// Construct the priority queue
		PriorityQueue<Node> q = new PriorityQueue<>(frequencies.size());
		for (Entry<Character, Integer> entry : frequencies.entrySet()) {
			Node node = new Node();
			node.character = entry.getKey();
			node.value = entry.getValue();
			q.add(node);
		}
		// Build the Huffman coding tree
		while (q.size() > 1) {
			Node left = q.poll();
			Node right = q.poll();

			Node newNode = new Node();
			newNode.value = left.value + right.value;
			newNode.left = left;
			newNode.right = right;

			q.add(newNode);
		}
		return q.poll();
	}

	// Constructs a map that maps the character to its code
	private static Map<Character, String> getCodesMap(Node root) {
		Map<Character, String> codesMap = new HashMap<>();
		buildCodesMap(root, codesMap, "");
		return codesMap;
	}

	private static void buildCodesMap(Node root, Map<Character, String> codesMap, String code) {
		if (root.left == null && root.right == null) {
			codesMap.put(root.character, code);
			return;
		}
		buildCodesMap(root.left, codesMap, code + "0");
		buildCodesMap(root.right, codesMap, code + "1");
	}

	private static String getEncodedText(String text, Map<Character, String> codesMap) {
		StringBuilder b = new StringBuilder();
		for (Character c : text.toCharArray()) {
			b.append(codesMap.get(c));
		}
		return b.toString();
	}

}
