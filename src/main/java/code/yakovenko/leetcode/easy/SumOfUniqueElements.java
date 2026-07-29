package code.yakovenko.leetcode.easy;

public final class SumOfUniqueElements {

	public int sumOfUnique(int[] nums) {
		final int[] frequency = new int[100];
		int sum = 0;

		for (final int num : nums) {
			final int currentFrequency = ++frequency[num - 1];

			if (currentFrequency == 1) {
				sum += num;
			} else if (currentFrequency == 2) {
				sum -= num;
			}
		}

		return sum;
	}
}
