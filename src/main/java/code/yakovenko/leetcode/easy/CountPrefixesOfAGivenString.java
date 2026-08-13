package code.yakovenko.leetcode.easy;

public final class CountPrefixesOfAGivenString {

	public int countPrefixes(String[] words, String s) {
		int count = 0;

		for (final String word : words) {
			if (s.startsWith(word)) {
				count++;
			}
		}

		return count;
	}
}
