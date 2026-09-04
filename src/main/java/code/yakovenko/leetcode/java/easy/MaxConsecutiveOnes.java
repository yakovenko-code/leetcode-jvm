package code.yakovenko.leetcode.java.easy;

public final class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int i = 0;
		int maxCount = 0;

		while (i < nums.length) {
			while (i < nums.length && nums[i] != 1) {
				i++;
			}

			int count = 0;

			while (i < nums.length && nums[i] != 0) {
				count++;
				i++;
			}

			maxCount = Math.max(maxCount, count);
		}

		return maxCount;
	}
}
