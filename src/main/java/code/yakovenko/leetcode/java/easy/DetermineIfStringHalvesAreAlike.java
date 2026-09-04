package code.yakovenko.leetcode.java.easy;

public final class DetermineIfStringHalvesAreAlike {

	private static final boolean[] IS_VOWEL = new boolean[128];

	static {
		for (final char character : "aeiouAEIOU".toCharArray()) {
			IS_VOWEL[character] = true;
		}
	}

	public boolean halvesAreAlike(String s) {
		final char[] characters = s.toCharArray();
		int count = 0;
		int half = characters.length / 2;

		for (int i = 0; i < half; i++) {
			if (IS_VOWEL[characters[i]]) {
				count++;
			}

			if (IS_VOWEL[characters[half + i]]) {
				count--;
			}
		}

		return count == 0;
	}
}
