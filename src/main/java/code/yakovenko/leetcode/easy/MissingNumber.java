package code.yakovenko.leetcode.easy;

public final class MissingNumber {

	public int missingNumber(int[] nums) {
		int sum = 0;

		for (final int num : nums) {
			sum += num;
		}

		return (nums.length * (nums.length + 1)) / 2 - sum;
	}
}
