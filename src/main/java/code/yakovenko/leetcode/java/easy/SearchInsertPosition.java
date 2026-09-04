package code.yakovenko.leetcode.java.easy;

public final class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			final int mid = left + (right - left) / 2;

			if (nums[mid] < target) {
				left = mid + 1;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				return mid;
			}
		}

		return left;
	}
}
