package code.yakovenko.leetcode.java.easy;

import java.util.Arrays;

public final class DecompressRunLengthEncodedList {

	public int[] decompressRLElist(int[] nums) {
		int size = 0;

		for (int i = 0; i < nums.length; i += 2) {
			size += nums[i];
		}

		final int[] result = new int[size];
		int position = 0;

		for (int i = 0; i < nums.length; i += 2) {
			final int[] tmp = new int[nums[i]];

			Arrays.fill(tmp, nums[i + 1]);
			System.arraycopy(tmp, 0, result, position, tmp.length);
			position += tmp.length;
		}

		return result;
	}
}
