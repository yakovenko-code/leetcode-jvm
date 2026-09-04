package code.yakovenko.leetcode.java.easy;

public final class MinimumOperationsToMakeArraySumDivisibleByK {

	public int minOperations(int[] nums, int k) {
		return sum(nums) % k;
	}

	private int sum(final int[] nums) {
		int sum = 0;

		for (final int num : nums) {
			sum += num;
		}

		return sum;
	}
}
