package code.yakovenko.leetcode.easy;

public final class FindTheHighestAltitude {

	public int largestAltitude(int[] gain) {
		int current = 0, max = 0;

		for (final int num : gain) {
			current += num;
			max = Math.max(max, current);
		}

		return max;
	}
}
