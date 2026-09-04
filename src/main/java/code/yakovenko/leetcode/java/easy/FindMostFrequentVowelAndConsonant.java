package code.yakovenko.leetcode.java.easy;

public final class FindMostFrequentVowelAndConsonant {

	public int maxFreqSum(String s) {
		final int[] frequency = new int[26];
		int maxVowel = 0, maxConsonant = 0;

		for (int i = 0; i < s.length(); i++) {
			final char letter = s.charAt(i);
			final int count = ++frequency[letter - 'a'];

			if (isVowel(letter)) {
				maxVowel = Math.max(maxVowel, count);
			} else {
				maxConsonant = Math.max(maxConsonant, count);
			}
		}

		return maxConsonant + maxVowel;
	}

	private boolean isVowel(final char letter) {
		return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
	}
}
