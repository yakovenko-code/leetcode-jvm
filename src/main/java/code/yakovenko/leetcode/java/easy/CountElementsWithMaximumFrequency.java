package code.yakovenko.leetcode.java.easy;

public final class CountElementsWithMaximumFrequency {

	public int maxFrequencyElements(int[] nums) {
		final int[] frequency = new int[101];
		int maxFrequency = 0;
		int count = 0;

		for (final int num : nums) {
			frequency[num]++;

			if (frequency[num] > maxFrequency) {
				maxFrequency = frequency[num];
				count = maxFrequency;
			} else if (frequency[num] == maxFrequency) {
				count += maxFrequency;
			}
		}

		return count;
	}
}
