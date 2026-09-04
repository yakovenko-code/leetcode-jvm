package code.yakovenko.leetcode.java.easy;

public final class ReverseLettersThenSpecialCharactersInAString {

	public String reverseByType(String s) {
		final char[] chars = s.toCharArray();
		final int size = chars.length;
		final StringBuilder stringBuilder = new StringBuilder(size);

		int letter = size - 1, special = size - 1;

		for (final char character : chars) {
			if (Character.isLetter(character)) {
				while (letter >= 0 && !Character.isLetter(chars[letter])) letter--;
				stringBuilder.append(chars[letter--]);
			} else {
				while (special >= 0 && Character.isLetter(chars[special])) special--;
				stringBuilder.append(chars[special--]);
			}
		}

		return stringBuilder.toString();
	}
}
