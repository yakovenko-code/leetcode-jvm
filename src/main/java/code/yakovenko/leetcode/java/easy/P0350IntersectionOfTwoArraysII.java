package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P0350IntersectionOfTwoArraysII {

	public int[] intersect(int[] nums1, int[] nums2) {
		final int[] frequency = new int[1001];
		final List<Integer> list = new ArrayList<>();

		for (final int num : nums1) {
			frequency[num]++;
		}

		for (final int num : nums2) {
			if (frequency[num] > 0) {
				list.add(num);
				frequency[num]--;
			}
		}

		final int[] result = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}
