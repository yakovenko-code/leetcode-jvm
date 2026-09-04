package code.yakovenko.leetcode.easy;

public final class SplitTheArray {

	public boolean isPossibleToSplit(int[] nums) {
		final int[] frequency = new int[100];

		for (final int num : nums) {
			if (++frequency[num - 1] > 2) {
				return false;
			}
		}

		return true;
	}
}
