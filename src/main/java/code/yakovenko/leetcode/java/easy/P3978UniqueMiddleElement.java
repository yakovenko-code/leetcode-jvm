package code.yakovenko.leetcode.java.easy;

public final class P3978UniqueMiddleElement {

	public boolean isMiddleElementUnique(int[] nums) {
		final int middle = nums[nums.length / 2];

		int left = 0, right = nums.length - 1;

		while (left < right) {
			if (nums[left++] == middle || nums[right--] == middle) {
				return false;
			}
		}

		return true;
	}
}
