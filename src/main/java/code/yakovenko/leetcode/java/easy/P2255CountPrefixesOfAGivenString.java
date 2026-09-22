package code.yakovenko.leetcode.java.easy;

public final class P2255CountPrefixesOfAGivenString {

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
