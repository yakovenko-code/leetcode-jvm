package code.yakovenko.leetcode.java.easy;

public final class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		int write = 0;

		for (final int num : nums) {
			if (nums[write] != num) {
				nums[++write] = num;
			}
		}

		return write + 1;
	}
}
