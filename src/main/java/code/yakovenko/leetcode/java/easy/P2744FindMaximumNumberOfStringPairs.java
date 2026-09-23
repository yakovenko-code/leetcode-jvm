package code.yakovenko.leetcode.java.easy;

public final class P2744FindMaximumNumberOfStringPairs {

	public int maximumNumberOfStringPairs(String[] words) {
		final boolean[][] seen = new boolean[26][26];
		int count = 0;

		for (final String word : words) {
			final char first = word.charAt(0);
			final char second = word.charAt(1);

			if (seen[second - 'a'][first - 'a']) {
				seen[second - 'a'][first - 'a'] = false;
				count++;
			} else {
				seen[first - 'a'][second - 'a'] = true;
			}
		}

		return count;
	}
}
