package code.yakovenko.leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;

public final class P0078Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		final List<List<Integer>> result = new ArrayList<>();

		backtrack(new ArrayList<>(), 0, nums, result);

		return result;
	}

	private void backtrack(
			final List<Integer> current, final int start, final int[] nums, final List<List<Integer>> result
	) {
		result.add(new ArrayList<>(current));

		for (int i = start; i < nums.length; i++) {
			current.add(nums[i]);
			backtrack(current, i + 1, nums, result);
			current.removeLast();
		}
	}
}
