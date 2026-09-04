package code.yakovenko.leetcode.java.easy;

public final class FirstLetterToAppearTwice {

	public char repeatedCharacter(String s) {
		final boolean[] seen = new boolean[26];

		for (final char character : s.toCharArray()) {
			if (seen[character - 'a']) {
				return character;
			}

			seen[character - 'a'] = true;
		}

		return 0;
	}
}
