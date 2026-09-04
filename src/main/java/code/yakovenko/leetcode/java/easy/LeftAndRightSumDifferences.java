package code.yakovenko.leetcode.java.easy;

public final class LeftAndRightSumDifferences {

	public int[] leftRightDifference(int[] nums) {
		int[] result = new int[nums.length];
		int currentLeftSum = 0, currentRightSum = sum(nums);

		for (int i = 0; i < nums.length; i++) {
			currentRightSum -= nums[i];
			result[i] = Math.abs(currentLeftSum - currentRightSum);
			currentLeftSum += nums[i];
		}

		return result;
	}

	private int sum(final int[] nums) {
		int sum = 0;

		for (final int num : nums) {
			sum += num;
		}

		return sum;
	}
}
