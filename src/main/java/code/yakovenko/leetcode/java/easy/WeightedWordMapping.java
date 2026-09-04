package code.yakovenko.leetcode.java.easy;

public final class WeightedWordMapping {

	public String mapWordWeights(String[] words, int[] weights) {
		final StringBuilder stringBuilder = new StringBuilder(words.length);

		for (final String word : words) {
			int weight = 0;

			for (int i = 0; i < word.length(); i++) {
				weight += weights[word.charAt(i) - 'a'];
			}

			stringBuilder.append((char) ('z' - weight % 26));
		}

		return stringBuilder.toString();
	}
}
