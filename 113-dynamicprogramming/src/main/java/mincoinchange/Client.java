package mincoinchange;

public class Client {

	public static void main(String[] args) {
		int[] coin1 = { 25, 10, 5 };
		System.out.println(miniCoinChange(coin1, 3, 30));
		int[] coin2 = { 9, 6, 5, 1 };
		System.out.println(miniCoinChange(coin2, 4, 13));
		int[] coin3 = { 1, 3, 5, 7 };
		System.out.println(miniCoinChange(coin3, 4, 18));
	}

	public static int miniCoinChange(int[] coin, int m, int K) {
		if (K == 0)
			return 0;

		int[] change = new int[K + 1];
		change[0] = 0;

		for (int i = 1; i <= K; i = i + 1)
			change[i] = Integer.MAX_VALUE;

		for (int i = 1; i <= K; i = i + 1) {
			for (int j = 0; j < m; j = j + 1) {
				if (coin[j] <= i) {
					int currCount = change[i - coin[j]];
					if (currCount != Integer.MAX_VALUE && currCount + 1 < change[i])
						change[i] = currCount + 1;
				}
			}
		}

		if (change[K] == Integer.MAX_VALUE)
			return -1;
		else
			return change[K];
	}

}
