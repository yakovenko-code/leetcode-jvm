package code.yakovenko.leetcode.java.easy;

public final class ComputeAlternatingSum {

	public int alternatingSum(int[] nums) {
		int sum = 0;
		int sign = 1;

		for (final int num : nums) {
			sum += sign * num;
			sign = -sign;
		}

		return sum;
	}
}
