package code.yakovenko.leetcode.java.medium;

public final class P2091RemovingMinimumAndMaximumFromArray {

	public int minimumDeletions(int[] nums) {
		final int size = nums.length;
		int minIndex = 0, maxIndex = 0;

		for (int i = 1; i < size; i++) {
			if (nums[i] < nums[minIndex]) {
				minIndex = i;
			} else if (nums[i] > nums[maxIndex]) {
				maxIndex = i;
			}
		}

		final int left = Math.min(minIndex, maxIndex);
		final int right = Math.max(minIndex, maxIndex);

		return Math.min(Math.min(right + 1, size - left), (left + 1) + (size - right));
	}
}
