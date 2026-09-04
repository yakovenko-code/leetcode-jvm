package code.yakovenko.leetcode.java.easy;

public final class NumberOfGoodPairs {

	public int numIdenticalPairs(int[] nums) {
		final int[] frequency = new int[100];
		int count = 0;

		for (final int num : nums) {
			count += frequency[num - 1]++;
		}

		return count;
	}
}
