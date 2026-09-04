package code.yakovenko.leetcode.java.easy;

public final class BuildArrayFromPermutation {

	public int[] buildArray(int[] nums) {
		final int[] ans = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}

		return ans;
	}
}
