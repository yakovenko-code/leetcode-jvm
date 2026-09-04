package code.yakovenko.leetcode.java.easy;

public final class MaximumDifferenceBetweenAdjacentElementsInACircularArray {

	public int maxAdjacentDistance(int[] nums) {
		int max = Math.abs(nums[nums.length - 1] - nums[0]);

		for (int i = 1; i < nums.length; i++) {
			max = Math.max(max, Math.abs(nums[i - 1] - nums[i]));
		}

		return max;
	}
}
