package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SummaryRanges {

	public List<String> summaryRanges(int[] nums) {
		if (nums.length == 0) return Collections.emptyList();

		final List<String> result = new ArrayList<>();
		int start = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				result.add(buildRange(start, nums[i - 1]));
				start = nums[i];
			}
		}

		result.add(buildRange(start, nums[nums.length - 1]));

		return result;
	}

	private String buildRange(final int start, final int stop) {
		if (start == stop) {
			return String.valueOf(start);
		} else {
			return start + "->" + stop;
		}
	}
}
