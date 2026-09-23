package code.yakovenko.leetcode.java.easy;

import java.util.HashMap;
import java.util.Map;

public final class P0001TwoSum {

	public int[] twoSum(int[] nums, int target) {
		final Map<Integer, Integer> seen = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			final Integer complementIndex = seen.get(nums[i]);

			if (complementIndex != null) {
				return new int[]{complementIndex, i};
			}

			seen.put(target - nums[i], i);
		}

		return new int[0];
	}
}
