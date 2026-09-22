package code.yakovenko.leetcode.java.easy;

public final class P0027RemoveElement {

	public int removeElement(int[] nums, int val) {
		int begin = 0, end = nums.length - 1;

		while (begin <= end) {
			if (nums[begin] == val) {
				nums[begin] = nums[end--];
			} else {
				begin++;
			}
		}

		return begin;
	}
}
