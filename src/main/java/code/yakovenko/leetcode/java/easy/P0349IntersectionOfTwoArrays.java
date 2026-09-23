package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P0349IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		final boolean[] seen = new boolean[1001];
		final List<Integer> list = new ArrayList<>();

		for (final int num : nums1) {
			seen[num] = true;
		}

		for (final int num : nums2) {
			if (seen[num]) {
				list.add(num);
				seen[num] = false;
			}
		}

		final int[] result = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}
