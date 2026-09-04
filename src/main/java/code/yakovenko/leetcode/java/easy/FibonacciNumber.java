package code.yakovenko.leetcode.java.easy;

public final class FibonacciNumber {

	public int fib(int n) {
		if (n <= 1) return n;

		int previous = 0, current = 1;

		for (int i = 0; i < n; i++) {
			final int tmp = previous;
			previous = current;
			current += tmp;
		}

		return previous;
	}
}
