package code.yakovenko.leetcode.easy;


import java.util.ArrayList;
import java.util.List;

public final class FindTheDifferenceOfTwoArrays {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		final boolean[] isNums1 = new boolean[2001];
		final boolean[] isNums2 = new boolean[2001];

		final List<Integer> difference1 = new ArrayList<>();
		final List<Integer> difference2 = new ArrayList<>();

		for (final int num : nums1) {
			isNums1[num + 1000] = true;
		}

		for (final int num : nums2) {
			isNums2[num + 1000] = true;
		}

		for (int i = 0; i < 2001; i++) {
			if (isNums1[i] && !isNums2[i]) {
				difference1.add(i - 1000);
			} else if (isNums2[i] && !isNums1[i]) {
				difference2.add(i - 1000);
			}
		}

		return List.of(difference1, difference2);
	}
}
