package code.yakovenko.leetcode.java.easy;

public final class P0645SetMismatch {

	public int[] findErrorNums(int[] nums) {
		final int size = nums.length;
		final boolean[] seen = new boolean[size];

		int duplicate = 0;
		int sum = 0;

		for (final int num : nums) {
			if (!seen[num - 1]) {
				seen[num - 1] = true;
				sum += num;
			} else {
				duplicate = num;
			}
		}

		return new int[]{duplicate, (size * (size + 1)) / 2 - sum};
	}
}
