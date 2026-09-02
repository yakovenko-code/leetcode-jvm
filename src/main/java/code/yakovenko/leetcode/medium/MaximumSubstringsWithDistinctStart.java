package code.yakovenko.leetcode.medium;

public final class MaximumSubstringsWithDistinctStart {

	public int maxDistinct(String s) {
		final boolean[] seen = new boolean[26];
		int count = 0;

		for (final char character : s.toCharArray()) {
			if (!seen[character - 'a']) {
				seen[character - 'a'] = true;
				count++;
			}
		}

		return count;
	}
}
