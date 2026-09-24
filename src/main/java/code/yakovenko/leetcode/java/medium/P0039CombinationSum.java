package code.yakovenko.leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;

public final class P0039CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		final List<List<Integer>> result = new ArrayList<>();

		backtrack(new ArrayList<>(), 0, target, candidates, result);

		return result;
	}

	private void backtrack(
			final List<Integer> current,
			final int start,
			final int remain,
			final int[] candidates,
			final List<List<Integer>> result
	) {
		if (remain == 0) {
			result.add(new ArrayList<>(current));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (remain >= candidates[i]) {
				current.add(candidates[i]);
				backtrack(current, i, remain - candidates[i], candidates, result);
				current.removeLast();
			}
		}
	}
}
