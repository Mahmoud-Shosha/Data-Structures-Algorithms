package Z;

import java.util.List;

public class ZClient {

	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		List<Integer> result = Z.search(pat, txt);
		System.out.println(result);
		txt = "hellohellowoohell";
		pat = "hello";
		result = Z.search(pat, txt);
		System.out.println(result);
	}

}
