package code.yakovenko.leetcode.easy;

public final class MaximumNumberOfWordsYouCanType {

	public int canBeTypedWords(String text, String brokenLetters) {
		final boolean[] isBroken = new boolean[26];
		int count = 0;
		boolean wordCanBeTyped = true;

		for (int i = 0; i < brokenLetters.length(); i++) {
			isBroken[brokenLetters.charAt(i) - 'a'] = true;
		}

		for (final char character : text.toCharArray()) {
			if (character == ' ') {
				if (wordCanBeTyped) {
					count++;
				}

				wordCanBeTyped = true;
			} else if (wordCanBeTyped && isBroken[character - 'a']) {
				wordCanBeTyped = false;
			}
		}

		if (wordCanBeTyped) {
			count++;
		}

		return count;
	}
}
