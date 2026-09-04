package code.yakovenko.leetcode.easy;

public final class MakeTwoArraysEqualByReversingSubarrays {

	public boolean canBeEqual(int[] target, int[] arr) {
		final int[] frequency = new int[1000];

		for (final int num : target) {
			frequency[num - 1]++;
		}

		for (final int num : arr) {
			frequency[num - 1]--;
		}

		for (final int num : frequency) {
			if (num != 0) {
				return false;
			}
		}

		return true;
	}
}
