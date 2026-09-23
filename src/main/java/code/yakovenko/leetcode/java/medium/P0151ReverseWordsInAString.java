package code.yakovenko.leetcode.java.medium;

public final class P0151ReverseWordsInAString {

	public String reverseWords(String s) {
		final char[] characters = s.toCharArray();
		final StringBuilder stringBuilder = new StringBuilder();
		int end = characters.length - 1;

		while (end >= 0) {
			while (end >= 0 && characters[end] == ' ') {
				end--;
			}

			if (end < 0) {
				break;
			}

			int start = end;
			while (start >= 0 && characters[start] != ' ') {
				start--;
			}

			if (!stringBuilder.isEmpty()) {
				stringBuilder.append(' ');
			}
			stringBuilder.append(s, start + 1, end + 1);

			end = start - 1;
		}

		return stringBuilder.toString();
	}
}
