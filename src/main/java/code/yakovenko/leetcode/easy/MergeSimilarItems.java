package code.yakovenko.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public final class MergeSimilarItems {

	public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
		final int[] weights = new int[1000];
		final List<List<Integer>> result = new ArrayList<>();

		for (final int[] item : items1) {
			weights[item[0] - 1] += item[1];
		}

		for (final int[] item : items2) {
			weights[item[0] - 1] += item[1];
		}

		for (int i = 0; i < 1000; i++) {
			final int sum = weights[i];

			if (sum != 0) {
				result.add(List.of(i + 1, sum));
			}
		}

		return result;
	}
}
