package code.yakovenko.leetcode.java.easy;

public final class FindCommonElementsBetweenTwoArrays {

	public int[] findIntersectionValues(int[] nums1, int[] nums2) {
		final int[] frequency1 = new int[100];
		final int[] frequency2 = new int[100];
		int answer1 = 0, answer2 = 0;

		for (final int num : nums1) {
			frequency1[num - 1]++;
		}

		for (final int num : nums2) {
			frequency2[num - 1]++;
		}

		for (int i = 0; i < 100; i++) {
			if (frequency1[i] > 0 && frequency2[i] > 0) {
				answer1 += frequency1[i];
				answer2 += frequency2[i];
			}
		}

		return new int[]{answer1, answer2};
	}
}
