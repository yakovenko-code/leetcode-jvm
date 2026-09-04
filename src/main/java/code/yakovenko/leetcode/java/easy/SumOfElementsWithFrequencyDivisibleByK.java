package code.yakovenko.leetcode.java.easy;

public final class SumOfElementsWithFrequencyDivisibleByK {

	public int sumDivisibleByK(int[] nums, int k) {
		final int[] frequency = new int[100];
		int count = 0;

		for (final int num : nums) {
			if (frequency[num - 1] % k == 0) {
				count -= frequency[num - 1] * num;
			}

			if (++frequency[num - 1] % k == 0) {
				count += frequency[num - 1] * num;
			}
		}

		return count;
	}
}
