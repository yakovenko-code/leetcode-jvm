package code.yakovenko.leetcode.java.easy;

public final class KeepMultiplyingFoundValuesByTwo {

	public int findFinalValue(int[] nums, int original) {
		final boolean[] frequency = new boolean[1001];

		for (final int num : nums) {
			frequency[num] = true;
		}

		while (original <= 1000 && frequency[original]) {
			original *= 2;
		}

		return original;
	}
}
