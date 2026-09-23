package code.yakovenko.leetcode.java.easy;

public final class P1859SortingTheSentence {

	public String sortSentence(String s) {
		final String[] words = s.split(" ");
		final String[] sorted = new String[words.length];

		for (final String word : words) {
			sorted[word.charAt(word.length() - 1) - '0' - 1] = word.substring(0, word.length() - 1);
		}

		return String.join(" ", sorted);
	}
}
