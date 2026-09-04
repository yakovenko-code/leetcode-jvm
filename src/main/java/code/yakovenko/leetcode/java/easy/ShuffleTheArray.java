package code.yakovenko.leetcode.java.easy;

public final class ShuffleTheArray {

	public int[] shuffle(int[] nums, int n) {
		final int[] result = new int[nums.length];

		for (int i = 0; i < n; i++) {
			result[2 * i] = nums[i];
			result[2 * i + 1] = nums[n + i];
		}

		return result;
	}
}
