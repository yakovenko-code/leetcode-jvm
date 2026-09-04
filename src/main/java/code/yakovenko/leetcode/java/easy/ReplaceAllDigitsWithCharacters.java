package code.yakovenko.leetcode.java.easy;

public final class ReplaceAllDigitsWithCharacters {

	public String replaceDigits(String s) {
		final char[] chars = s.toCharArray();

		for (int i = 1; i < chars.length; i += 2) {
			chars[i] = shift(chars[i - 1], chars[i] - '0');
		}

		return String.valueOf(chars);
	}

	private char shift(char c, int x) {
		return (char) (c + x);
	}
}
