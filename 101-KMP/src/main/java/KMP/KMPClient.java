package KMP;

import java.util.List;

public class KMPClient {

	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		List<Integer> result = KMP.search(pat, txt);
		System.out.println(result);
		txt = "hellohellowoohell";
		pat = "hello";
		result = KMP.search(pat, txt);
		System.out.println(result);
	}

}
