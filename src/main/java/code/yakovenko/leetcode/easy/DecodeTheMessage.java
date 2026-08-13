package code.yakovenko.leetcode.easy;

public final class DecodeTheMessage {

	public String decodeMessage(String key, String message) {
		final StringBuilder stringBuilder = new StringBuilder(message.length());
		final char[] result = new char[26];
		char letter = 'a';

		for (final char character : key.toCharArray()) {
			if (character != ' ' && result[character - 'a'] == 0) {
				result[character - 'a'] = letter++;
			}
		}

		for (final char character : message.toCharArray()) {
			stringBuilder.append(character == ' ' ? ' ' : result[character - 'a']);
		}

		return stringBuilder.toString();
	}
}
