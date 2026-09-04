package code.yakovenko.leetcode.easy;

public final class DecryptStringFromAlphabetToIntegerMapping {

	public String freqAlphabets(String s) {
		final char[] characters = s.toCharArray();
		final StringBuilder stringBuilder = new StringBuilder();

		int i = 0;

		while (i < characters.length) {
			final int num;

			if (i + 2 < characters.length && characters[i + 2] == '#') {
				num = (characters[i] - '0') * 10 + (characters[i + 1] - '0');
				i += 3;
			} else {
				num = characters[i] - '0';
				i++;
			}

			stringBuilder.append((char) ('a' + num - 1));
		}

		return stringBuilder.toString();
	}
}
