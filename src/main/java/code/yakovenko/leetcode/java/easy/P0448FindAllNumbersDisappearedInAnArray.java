package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P0448FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
		final boolean[] seen = new boolean[nums.length];
		final List<Integer> result = new ArrayList<>();

		for (final int num : nums) {
			seen[num - 1] = true;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!seen[i]) {
				result.add(i + 1);
			}
		}

		return result;
	}
}
