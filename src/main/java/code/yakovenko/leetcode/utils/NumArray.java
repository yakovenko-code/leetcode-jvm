package code.yakovenko.leetcode.utils;

public class NumArray {

	private final int[] prefixSums;

	public NumArray(int[] nums) {
		prefixSums = new int[nums.length + 1];

		for (int i = 0; i < nums.length; i++) {
			prefixSums[i + 1] = prefixSums[i] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		return prefixSums[right + 1] - prefixSums[left];
	}
}
