package code.yakovenko.leetcode.java.easy;

public final class ConcatenateArrayWithReverse {

	public int[] concatWithReverse(int[] nums) {
		final int length = nums.length;
		final int[] ans = new int[2 * length];

		for (int i = 0; i < length; i++) {
			ans[i] = nums[i];
			ans[2 * length - 1 - i] = nums[i];
		}

		return ans;
	}
}
