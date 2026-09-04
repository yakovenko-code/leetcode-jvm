package code.yakovenko.leetcode.java.easy;

public final class CountingWordsWithAGivenPrefix {

	public int prefixCount(String[] words, String pref) {
		int count = 0;

		for (final String word : words) {
			if (word.startsWith(pref)) {
				count++;
			}
		}

		return count;
	}
}
