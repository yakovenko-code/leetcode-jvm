package code.yakovenko.leetcode.java.easy;

public final class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {
		final StringBuilder stringBuilder = new StringBuilder(word1.length() + word2.length());
		int i = 0, j = 0;

		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) stringBuilder.append(word1.charAt(i++));
			if (j < word2.length()) stringBuilder.append(word2.charAt(j++));
		}

		return stringBuilder.toString();
	}
}
