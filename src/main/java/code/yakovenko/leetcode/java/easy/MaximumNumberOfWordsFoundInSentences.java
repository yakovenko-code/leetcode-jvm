package code.yakovenko.leetcode.java.easy;

public final class MaximumNumberOfWordsFoundInSentences {

	public int mostWordsFound(String[] sentences) {
		int maxWords = 0;

		for (final String sentence : sentences) {
			int words = 1;
			int index = 0;

			while ((index = sentence.indexOf(' ', index)) != -1) {
				index++;
				words++;
			}

			maxWords = Math.max(maxWords, words);
		}

		return maxWords;
	}
}
