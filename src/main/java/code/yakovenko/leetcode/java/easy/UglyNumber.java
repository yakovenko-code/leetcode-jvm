package code.yakovenko.leetcode.java.easy;

public final class UglyNumber {

	private static final int[] PRIMES = {2, 3, 5};

	public boolean isUgly(int n) {
		if (n == 0) return false;

		for (int prime : PRIMES) {
			while (n % prime == 0) {
				n /= prime;
			}
		}

		return n == 1;
	}
}
