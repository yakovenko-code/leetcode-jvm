package code.yakovenko.leetcode.java.easy;

public final class ConcatenationOfArray {

	public int[] getConcatenation(int[] nums) {
		final int length = nums.length;
		final int[] ans = new int[2 * length];

		System.arraycopy(nums, 0, ans, 0, length);
		System.arraycopy(nums, 0, ans, length, length);

		return ans;
	}
}
