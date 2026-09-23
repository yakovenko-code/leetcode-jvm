package code.yakovenko.leetcode.java.easy;

public final class P2586CountTheNumberOfVowelStringsInRange {

	private static final boolean[] IS_VOWEL = new boolean[26];

	static {
		for (final char character : "aeiou".toCharArray()) {
			IS_VOWEL[character - 'a'] = true;
		}
	}

	public int vowelStrings(String[] words, int left, int right) {
		int count = 0;

		for (int i = left; i <= right; i++) {
			final String word = words[i];

			if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
				count++;
			}
		}

		return count;
	}

	private boolean isVowel(final char character) {
		return IS_VOWEL[character - 'a'];
	}
}
