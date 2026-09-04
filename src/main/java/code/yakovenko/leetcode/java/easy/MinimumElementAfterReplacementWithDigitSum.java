package code.yakovenko.leetcode.java.easy;

public final class MinimumElementAfterReplacementWithDigitSum {

	public int minElement(int[] nums) {
		int minDigitSum = Integer.MAX_VALUE;

		for (final int num : nums) {
			minDigitSum = Math.min(minDigitSum, digitSum(num));
		}

		return minDigitSum;
	}

	private int digitSum(int num) {
		int sum = 0;

		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}
}
