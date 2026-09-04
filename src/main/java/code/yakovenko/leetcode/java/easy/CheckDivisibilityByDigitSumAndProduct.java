package code.yakovenko.leetcode.java.easy;

public final class CheckDivisibilityByDigitSumAndProduct {

	public boolean checkDivisibility(int n) {
		final int number = n;
		int sum = 0, product = 1;

		while (n != 0) {
			final int digit = n % 10;

			sum += digit;
			product *= digit;

			n /= 10;
		}

		return number % (sum + product) == 0;
	}
}
