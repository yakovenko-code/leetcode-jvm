package code.yakovenko.leetcode.easy;

public final class MinimumCommonValue {

	public int getCommon(int[] nums1, int[] nums2) {
		int first = 0, second = 0;

		while (first < nums1.length && second < nums2.length) {
			if (nums1[first] < nums2[second]) {
				first++;
			} else if (nums2[second] < nums1[first]) {
				second++;
			} else {
				return nums1[first];
			}
		}

		return -1;
	}
}
