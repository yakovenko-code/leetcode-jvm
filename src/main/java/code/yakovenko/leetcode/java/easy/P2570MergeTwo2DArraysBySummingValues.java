package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P2570MergeTwo2DArraysBySummingValues {

	public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		final List<int[]> result = new ArrayList<>();
		int index1 = 0, index2 = 0;

		while (index1 < nums1.length && index2 < nums2.length) {
			if (nums1[index1][0] < nums2[index2][0]) {
				result.add(nums1[index1++]);
			} else if (nums1[index1][0] > nums2[index2][0]) {
				result.add(nums2[index2++]);
			} else {
				result.add(new int[]{nums1[index1][0], nums1[index1++][1] + nums2[index2++][1]});
			}
		}

		while (index1 < nums1.length) {
			result.add(nums1[index1++]);
		}

		while (index2 < nums2.length) {
			result.add(nums2[index2++]);
		}

		return result.toArray(new int[result.size()][]);
	}
}
