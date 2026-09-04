package code.yakovenko.leetcode.java.easy;

public final class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {
		int result = 0;

		for (final int num : nums) {
			if ((int) (Math.log10(num) + 1) % 2 == 0) {
				result++;
			}
		}

		return result;
	}
}
