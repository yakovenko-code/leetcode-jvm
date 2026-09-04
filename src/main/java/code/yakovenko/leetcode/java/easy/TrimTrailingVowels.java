package code.yakovenko.leetcode.java.easy;

public final class TrimTrailingVowels {

	private static final boolean[] IS_VOWEL = new boolean[256];

	static {
		for (final char vowel : "aeiou".toCharArray()) {
			IS_VOWEL[vowel] = true;
		}
	}

	public String trimTrailingVowels(String s) {
		int right = s.length();


		while (right > 0 && IS_VOWEL[s.charAt(right - 1)]) {
			right--;
		}

		return s.substring(0, right);
	}
}
