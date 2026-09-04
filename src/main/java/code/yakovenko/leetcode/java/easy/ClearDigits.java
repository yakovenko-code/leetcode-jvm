package code.yakovenko.leetcode.java.easy;

public final class ClearDigits {

	public String clearDigits(String s) {
		final StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			final char character = s.charAt(i);

			if (Character.isDigit(character)) {
				stringBuilder.deleteCharAt(stringBuilder.length() - 1);
			} else {
				stringBuilder.append(character);
			}
		}

		return stringBuilder.toString();
	}
}
