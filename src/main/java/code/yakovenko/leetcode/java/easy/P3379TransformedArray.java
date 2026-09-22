package code.yakovenko.leetcode.java.easy;

public final class P3379TransformedArray {

	public int[] constructTransformedArray(int[] nums) {
		final int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[Math.floorMod(i + nums[i], nums.length)];
		}

		return result;
	}
}
