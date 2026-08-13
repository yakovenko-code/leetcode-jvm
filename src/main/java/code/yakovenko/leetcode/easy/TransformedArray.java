package code.yakovenko.leetcode.easy;

public final class TransformedArray {

	public int[] constructTransformedArray(int[] nums) {
		final int[] result = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			result[i] = nums[Math.floorMod(i + nums[i], nums.length)];
		}

		return result;
	}
}
