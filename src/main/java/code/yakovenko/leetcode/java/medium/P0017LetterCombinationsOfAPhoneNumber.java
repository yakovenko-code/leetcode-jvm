package code.yakovenko.leetcode.java.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class P0017LetterCombinationsOfAPhoneNumber {

	private static final Map<Character, char[]> KEYBOARD = Map.of(
			'2', new char[]{'a', 'b', 'c'},
			'3', new char[]{'d', 'e', 'f'},
			'4', new char[]{'g', 'h', 'i'},
			'5', new char[]{'j', 'k', 'l'},
			'6', new char[]{'m', 'n', 'o'},
			'7', new char[]{'p', 'q', 'r', 's'},
			'8', new char[]{'t', 'u', 'v'},
			'9', new char[]{'w', 'x', 'y', 'z'}
	);

	public List<String> letterCombinations(String digits) {
		final List<String> result = new ArrayList<>();

		backtrack(new char[digits.length()], 0, digits.toCharArray(), result);

		return result;
	}

	private void backtrack(final char[] current, final int index, final char[] digits, final List<String> result) {
		if (index == digits.length) {
			result.add(new String(current));
			return;
		}

		for (final char character : KEYBOARD.get(digits[index])) {
			current[index] = character;
			backtrack(current, index + 1, digits, result);
		}
	}
}
