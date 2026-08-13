package code.yakovenko.leetcode.easy;

public final class MinimumOperationsToExceedThresholdValueI {

	public int minOperations(int[] nums, int k) {
		int count = 0;

		for (final int num : nums) {
			if (num < k) {
				count++;
			}
		}

		return count;
	}
}
