package code.yakovenko.leetcode.java.easy;

public final class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

	public boolean areOccurrencesEqual(String s) {
		final int[] occurrences = new int[26];

		for (final char character : s.toCharArray()) {
			++occurrences[character - 'a'];
		}

		final int baseOccurrence = occurrences[s.charAt(0) - 'a'];

		for (final int occurrence : occurrences) {
			if (occurrence != 0 && occurrence != baseOccurrence) {
				return false;
			}
		}

		return true;
	}
}
