package code.yakovenko.leetcode.java.easy;

public final class P1365HowManyNumbersAreSmallerThanTheCurrentNumber {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		final int[] frequency = new int[101];
		final int[] result = new int[nums.length];

		for (final int num : nums) {
			frequency[num]++;
		}

		int runningSum = 0;
		for (int i = 0; i < 101; i++) {
			final int currentFrequency = frequency[i];
			frequency[i] = runningSum;
			runningSum += currentFrequency;
		}

		for (int i = 0; i < nums.length; i++) {
			result[i] = frequency[nums[i]];
		}

		return result;
	}
}
