package KMP;

import java.util.ArrayList;
import java.util.List;

public class KMP {

	public static List<Integer> search(String pat, String txt) {
		List<Integer> result = new ArrayList<>();
		int N = txt.length();
		int M = pat.length();
		int i = 0;
		int j = 0;
		int[] lps = getLPSArray(pat, M);
		while ((N - i) >= (M - j)) {
			if (txt.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
				if (j == M) {
					result.add(i - j);
					j = lps[j - 1];
				}
			} else if (j != 0) {
				j = lps[j - 1];

			} else {
				i++;
			}
		}
		return result;
	}

	public static int[] getLPSArray(String pat, int M) {
		int len = 0; // length of previous LPS
		int i = 1;
		int[] lps = new int[M];
		lps[0] = 0; // lps[0] is always 0
		while (i < M) {
			if (pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					i++;
				}
			}
		}
		return lps;
	}

}
