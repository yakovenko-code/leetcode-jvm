package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class IntersectionOfMultipleArrays {

	public List<Integer> intersection(int[][] nums) {
		final int[] frequency = new int[1000];
		final List<Integer> result = new ArrayList<>();

		for (final int[] array : nums) {
			for (final int num : array) {
				frequency[num - 1]++;
			}
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] == nums.length) {
				result.add(i + 1);
			}
		}

		return result;
	}
}
