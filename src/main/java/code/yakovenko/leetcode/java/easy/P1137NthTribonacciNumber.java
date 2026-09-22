package code.yakovenko.leetcode.java.easy;

public final class P1137NthTribonacciNumber {

	public int tribonacci(int n) {
		if (n == 0) return 0;
		if (n == 1 || n == 2) return 1;

		int t0 = 0, t1 = 1, t2 = 1;

		for (int i = 3; i <= n; i++) {
			final int next = t2;

			t2 += t0 + t1;
			t0 = t1;
			t1 = next;
		}

		return t2;
	}
}
