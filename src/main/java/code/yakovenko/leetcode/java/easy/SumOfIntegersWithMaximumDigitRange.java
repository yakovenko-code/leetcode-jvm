package code.yakovenko.leetcode.java.easy;

public final class SumOfIntegersWithMaximumDigitRange {

	public int maxDigitRange(int[] nums) {
		int result = 0;
		int maxRange = 0;

		for (int num : nums) {
			final int range = digitRange(num);

			if (range > maxRange) {
				maxRange = range;
				result = num;
			} else if (range == maxRange) {
				result += num;
			}
		}

		return result;
	}

	private int digitRange(int num) {
		int maxDigit = num % 10;
		int minDigit = num % 10;
		num /= 10;

		while (num != 0) {
			int digit = num % 10;
			maxDigit = Math.max(maxDigit, digit);
			minDigit = Math.min(minDigit, digit);
			num /= 10;
		}

		return maxDigit - minDigit;
	}
}
