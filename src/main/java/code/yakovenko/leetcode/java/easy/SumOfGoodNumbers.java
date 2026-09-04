package code.yakovenko.leetcode.java.easy;

public final class SumOfGoodNumbers {

	public int sumOfGoodNumbers(int[] nums, int k) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			boolean isGood = true;

			if (0 <= i - k) isGood &= nums[i] > nums[i - k];
			if (i + k < nums.length) isGood &= nums[i] > nums[i + k];

			if (isGood) {
				sum += nums[i];
			}
		}

		return sum;
	}
}
