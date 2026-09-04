package code.yakovenko.leetcode.java.easy;

public final class TransformArrayByParity {

	public int[] transformArray(int[] nums) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			if (nums[left] % 2 == 0) {
				nums[left++] = 0;
			} else {
				nums[left] = nums[right];
				nums[right--] = 1;
			}
		}

		return nums;
	}
}
