package code.yakovenko.leetcode.java.easy;

public final class P2733NeitherMinimumNorMaximum {

	public int findNonMinOrMax(int[] nums) {
		if (nums.length < 3) return -1;

		return nums[0] + nums[1] + nums[2] -
				Math.min(nums[0], Math.min(nums[1], nums[2])) -
				Math.max(nums[0], Math.max(nums[1], nums[2]));
	}
}
