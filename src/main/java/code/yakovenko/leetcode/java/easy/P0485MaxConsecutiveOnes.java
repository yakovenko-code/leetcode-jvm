package code.yakovenko.leetcode.java.easy;

public final class P0485MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int startIndex, currentIndex = 0;
		int max = 0;

		while (currentIndex < nums.length) {
			while (currentIndex < nums.length && nums[currentIndex] == 0) {
				currentIndex++;
			}

			startIndex = currentIndex;

			while (currentIndex < nums.length && nums[currentIndex] == 1) {
				currentIndex++;
			}

			max = Math.max(max, currentIndex - startIndex);
		}

		return max;
	}
}
