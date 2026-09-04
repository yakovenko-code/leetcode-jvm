package code.yakovenko.leetcode.java.easy;

public final class CountTheDigitsThatDivideANumber {

	public int countDigits(int num) {
		int count = 0;
		final int original = num;

		while (num != 0) {
			final int digit = num % 10;

			if (original % digit == 0) {
				count++;
			}

			num /= 10;
		}

		return count;
	}
}
