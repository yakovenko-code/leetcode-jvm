package code.yakovenko.leetcode.easy;

public final class MaximumProductOfTwoDigits {

	public int maxProduct(int n) {
		int firstMax = -1, secondMax = -1;

		while (n != 0) {
			final int digit = n % 10;

			if (digit >= firstMax) {
				secondMax = firstMax;
				firstMax = digit;
			} else if (digit > secondMax) {
				secondMax = digit;
			}

			n /= 10;
		}

		return firstMax * secondMax;
	}
}
