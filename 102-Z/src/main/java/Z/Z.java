package Z;

import java.util.ArrayList;
import java.util.List;

public class Z {

	public static List<Integer> search(String pat, String txt) {
		List<Integer> result = new ArrayList<>();
		String concat = pat + "$" + txt;
		int n = concat.length();
		int Z[] = getZArray(concat, n); // Construct Z array
		for (int i = 0; i < n; ++i) {
			if (Z[i] == pat.length()) {
				result.add(i - pat.length() - 1);
			}
		}
		return result;
	}

	private static int[] getZArray(String str, int n) {
		int Z[] = new int[n];
		int L = 0, R = 0; // [L,R] make a window which matches with prefix of str
		for (int i = 1; i < n; ++i) {
			// if i>R nothing matches so we will calculate Z[i] using naive way
			if (i > R) {
				// R-L = 0 in starting, so it will start checking from 0'th index
				// For example, for "ababab" and i = 1, the value of R
				// remains 0 and Z[i] becomes 0
				// For string "aaaaaa" and i = 1, Z[i] and R become 5
				L = R = i;
				while (R < n && str.charAt(R - L) == str.charAt(R))
					R++;
				Z[i] = R - L;
				R--;
			} else {
				// k = i-L so k corresponds to number which matches in [L,R] interval
				int k = i - L;
				// if Z[k] is less than remaining interval then Z[i] will be equal to Z[k]
				// For example, str = "ababab", i = 3, R = 5 and L = 2
				if (Z[k] < R - i + 1) {
					Z[i] = Z[k];
				} else {
					// else start from R and check manually
					L = i;
					while (R < n && str.charAt(R - L) == str.charAt(R))
						R++;
					Z[i] = R - L;
					R--;
				}
			}
		}
		return Z;
	}

}
