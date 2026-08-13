package code.yakovenko.leetcode.easy;

public final class ThreeDivisors {

	public boolean isThree(int n) {
		final int sqrt = (int) Math.sqrt(n);
		int count = 0;

		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) {
				count++;

				if (i != n / i) {
					count++;
				}

				if (count > 3) {
					return false;
				}
			}
		}

		return count == 3;
	}
}
