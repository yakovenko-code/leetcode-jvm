package code.yakovenko.leetcode.java.easy;

public final class ValidDigitNumber {

	public boolean validDigit(int n, int x) {
		boolean isContain = false;

		while (n >= 10) {
			final int digit = n % 10;

			if (digit == x) {
				isContain = true;
				break;
			}

			n /= 10;
		}

		return isContain && n % 10 != x;
	}
}
