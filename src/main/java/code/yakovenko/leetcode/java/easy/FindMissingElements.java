package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class FindMissingElements {

	public List<Integer> findMissingElements(int[] nums) {
		final boolean[] isContain = new boolean[101];
		final List<Integer> result = new ArrayList<>();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (final int num : nums) {
			min = Math.min(min, num);
			max = Math.max(max, num);
			isContain[num] = true;
		}

		for (int i = min + 1; i < max; i++) {
			if (!isContain[i]) {
				result.add(i);
			}
		}

		return result;
	}
}
