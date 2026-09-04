package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class KeyboardRow {

	private static final int[] KEYBOARD = new int[26];

	static {
		for (final char character : "qwertyuiop".toCharArray()) KEYBOARD[character - 'a'] = 1;
		for (final char character : "asdfghjkl".toCharArray()) KEYBOARD[character - 'a'] = 2;
		for (final char character : "zxcvbnm".toCharArray()) KEYBOARD[character - 'a'] = 3;
	}

	public String[] findWords(String[] words) {
		final List<String> result = new ArrayList<>();

		for (final String word : words) {
			if (isSameRow(word)) {
				result.add(word);
			}
		}

		return result.toArray(new String[0]);
	}

	private boolean isSameRow(String word) {
		final int row = KEYBOARD[Character.toLowerCase(word.charAt(0)) - 'a'];

		for (int i = 1; i < word.length(); i++) {
			if (row != KEYBOARD[Character.toLowerCase(word.charAt(i)) - 'a']) {
				return false;
			}
		}

		return true;
	}
}
