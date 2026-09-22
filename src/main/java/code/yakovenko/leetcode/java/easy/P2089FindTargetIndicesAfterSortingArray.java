package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P2089FindTargetIndicesAfterSortingArray {

	public List<Integer> targetIndices(int[] nums, int target) {
		int lessCount = 0, equalCount = 0;

		for (final int num : nums) {
			if (num < target) {
				lessCount++;
			} else if (num == target) {
				equalCount++;
			}
		}

		final List<Integer> result = new ArrayList<>(equalCount);

		for (int i = 0; i < equalCount; i++) {
			result.add(lessCount + i);
		}

		return result;
	}
}
