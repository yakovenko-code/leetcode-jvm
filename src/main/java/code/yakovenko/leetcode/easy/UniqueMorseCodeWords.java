package code.yakovenko.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public final class UniqueMorseCodeWords {

	private static final String[] LETTER_TO_MORSE = new String[]{
			".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
			"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
	};

	public int uniqueMorseRepresentations(String[] words) {
		final Set<String> set = new HashSet<>();

		for (final String word : words) {
			set.add(toMorse(word));
		}

		return set.size();
	}

	private String toMorse(final String word) {
		final StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			stringBuilder.append(LETTER_TO_MORSE[word.charAt(i) - 'a']);
		}

		return stringBuilder.toString();
	}
}
