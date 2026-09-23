package code.yakovenko.leetcode.java.easy;

public final class P3487MaximumUniqueSubarraySumAfterDeletion {

	public int maxSum(int[] nums) {
		final boolean[] seen = new boolean[101];
		int sum = 0, max = Integer.MIN_VALUE;

		for (final int num : nums) {
			if (num > 0 && !seen[num]) {
				sum += num;
				seen[num] = true;
			}

			max = Math.max(max, num);
		}

		return sum == 0 ? max : sum;
	}
}
